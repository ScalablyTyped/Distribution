package typings.microsoftFetchEventSource

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("@microsoft/fetch-event-source/lib/cjs/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBytes(
    stream: ReadableStream[js.typedarray.Uint8Array],
    onChunk: js.Function1[/* arr */ js.typedarray.Uint8Array, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(stream.asInstanceOf[js.Any], onChunk.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getLines(onLine: js.Function2[/* line */ js.typedarray.Uint8Array, /* fieldLength */ Double, Unit]): js.Function1[/* arr */ js.typedarray.Uint8Array, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLines")(onLine.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.typedarray.Uint8Array, Unit]]
  
  inline def getMessages(onId: js.Function1[/* id */ String, Unit], onRetry: js.Function1[/* retry */ Double, Unit]): js.Function2[/* line */ js.typedarray.Uint8Array, /* fieldLength */ Double, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessages")(onId.asInstanceOf[js.Any], onRetry.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* line */ js.typedarray.Uint8Array, /* fieldLength */ Double, Unit]]
  inline def getMessages(
    onId: js.Function1[/* id */ String, Unit],
    onRetry: js.Function1[/* retry */ Double, Unit],
    onMessage: js.Function1[/* msg */ EventSourceMessage, Unit]
  ): js.Function2[/* line */ js.typedarray.Uint8Array, /* fieldLength */ Double, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessages")(onId.asInstanceOf[js.Any], onRetry.asInstanceOf[js.Any], onMessage.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* line */ js.typedarray.Uint8Array, /* fieldLength */ Double, Unit]]
  
  trait EventSourceMessage extends StObject {
    
    var data: String
    
    var event: String
    
    var id: String
    
    var retry: js.UndefOr[Double] = js.undefined
  }
  object EventSourceMessage {
    
    inline def apply(data: String, event: String, id: String): EventSourceMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSourceMessage]
    }
    
    extension [Self <: EventSourceMessage](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    }
  }
}
