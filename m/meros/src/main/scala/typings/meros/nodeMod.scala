package typings.meros

import typings.meros.anon.Multiple
import typings.meros.anon.`0`
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.std.AsyncGenerator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("meros/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def meros[T](response: IncomingMessage): js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])] = ^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])]]
  inline def meros[T](response: IncomingMessage, options: Multiple): js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])]]
  inline def meros[T](response: IncomingMessage, options: `0`): js.Promise[IncomingMessage | (AsyncGenerator[js.Array[Part[T, Buffer]], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IncomingMessage | (AsyncGenerator[js.Array[Part[T, Buffer]], Any, Any])]]
  inline def meros[T](response: IncomingMessage, options: Options): js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])]]
  
  trait Options extends StObject {
    
    /**
    	 * Setting this to true will yield an array. In other words; instead of yielding once for every payload—we collect
    	 * all complete payloads for a chunk and then yield.
    	 *
    	 * @default false
    	 */
    var multiple: Boolean
  }
  object Options {
    
    inline def apply(multiple: Boolean): Options = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.meros.anon.Body[Fallback]
    - typings.meros.anon.Headers[Body]
  */
  trait Part[Body, Fallback] extends StObject
  object Part {
    
    inline def Body[Fallback](body: Fallback, headers: Record[String, String]): typings.meros.anon.Body[Fallback] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = false)
      __obj.asInstanceOf[typings.meros.anon.Body[Fallback]]
    }
    
    inline def Headers[Body](body: Body, headers: Record[String, String]): typings.meros.anon.Headers[Body] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = true)
      __obj.asInstanceOf[typings.meros.anon.Headers[Body]]
    }
  }
}
