package typings.next

import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerBodyStreamsMod {
  
  @JSImport("next/dist/server/body-streams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bodyStreamToNodeStream(bodyStream: ReadableStream[js.typedarray.Uint8Array]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyStreamToNodeStream")(bodyStream.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  inline def getClonableBody[T /* <: IncomingMessage */](readable: T): ClonableBody = ^.asInstanceOf[js.Dynamic].applyDynamic("getClonableBody")(readable.asInstanceOf[js.Any]).asInstanceOf[ClonableBody]
  
  inline def requestToBodyStream(context: typings.next.anon.ReadableStream, stream: Readable): ReadableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestToBodyStream")(context.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[ReadableStream[Any]]
  
  trait ClonableBody extends StObject {
    
    def cloneBodyStream(): Readable
  }
  object ClonableBody {
    
    inline def apply(cloneBodyStream: () => Readable): ClonableBody = {
      val __obj = js.Dynamic.literal(cloneBodyStream = js.Any.fromFunction0(cloneBodyStream))
      __obj.asInstanceOf[ClonableBody]
    }
    
    extension [Self <: ClonableBody](x: Self) {
      
      inline def setCloneBodyStream(value: () => Readable): Self = StObject.set(x, "cloneBodyStream", js.Any.fromFunction0(value))
    }
  }
}
