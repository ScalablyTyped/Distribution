package typings.meros

import typings.meros.anon.Multiple
import typings.meros.anon.`0`
import typings.std.AsyncGenerator
import typings.std.Record
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("meros/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def meros[T](response: Response): js.Promise[Response | (AsyncGenerator[Part[T, String], Any, Any])] = ^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response | (AsyncGenerator[Part[T, String], Any, Any])]]
  inline def meros[T](response: Response, options: Multiple): js.Promise[Response | (AsyncGenerator[Part[T, String], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response | (AsyncGenerator[Part[T, String], Any, Any])]]
  inline def meros[T](response: Response, options: `0`): js.Promise[Response | (AsyncGenerator[js.Array[Part[T, String]], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response | (AsyncGenerator[js.Array[Part[T, String]], Any, Any])]]
  inline def meros[T](response: Response, options: Options): js.Promise[Response | (AsyncGenerator[Part[T, String], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response | (AsyncGenerator[Part[T, String], Any, Any])]]
  
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
    
    extension [Self <: Options](x: Self) {
      
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
