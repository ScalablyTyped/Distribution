package typings.meros

import typings.meros.anon.Multiple
import typings.meros.anon.`0`
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.std.AsyncGenerator
import typings.std.Record
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("meros", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Yield immediately for every part made available on the response. If the `content-type` of the response isn't a
    * multipart body, then we'll resolve with {@link IncomingMessage}.
    *
    * @example
    *
    * ```js
    * const response = await new Promise((resolve) => {
    *   const request = http.get(`http://my-domain/mock-ep`, (response) => {
    *   	resolve(response);
    *   });
    *   request.end();
    * });
    *
    * const parts = await meros(response);
    *
    * for await (const part of parts) {
    *     // do something with this part
    * }
    * ```
    */
  inline def meros[T](response: IncomingMessage): js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])] = ^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])]]
  inline def meros[T](response: IncomingMessage, options: Multiple): js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])]]
  // Node~
  inline def meros[T](response: IncomingMessage, options: `0`): js.Promise[IncomingMessage | (AsyncGenerator[js.Array[Part[T, Buffer]], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IncomingMessage | (AsyncGenerator[js.Array[Part[T, Buffer]], Any, Any])]]
  inline def meros[T](response: IncomingMessage, options: Options): js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IncomingMessage | (AsyncGenerator[Part[T, Buffer], Any, Any])]]
  /**
    * Yield immediately for every part made available on the response. If the `content-type` of the response isn't a
    * multipart body, then we'll resolve with {@link Response}.
    *
    * @example
    *
    * ```js
    * const parts = await fetch('/fetch-multipart')
    *      .then(meros);
    *
    * for await (const part of parts) {
    *     // do something with this part
    * }
    * ```
    */
  inline def meros[T](response: Response): js.Promise[Response | (AsyncGenerator[Part[T, Buffer], Any, Any])] = ^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response | (AsyncGenerator[Part[T, Buffer], Any, Any])]]
  inline def meros[T](response: Response, options: Multiple): js.Promise[Response | (AsyncGenerator[Part[T, Buffer], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response | (AsyncGenerator[Part[T, Buffer], Any, Any])]]
  // Browser~
  inline def meros[T](response: Response, options: `0`): js.Promise[Response | (AsyncGenerator[js.Array[Part[T, Buffer]], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response | (AsyncGenerator[js.Array[Part[T, Buffer]], Any, Any])]]
  inline def meros[T](response: Response, options: Options): js.Promise[Response | (AsyncGenerator[Part[T, Buffer], Any, Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("meros")(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response | (AsyncGenerator[Part[T, Buffer], Any, Any])]]
  
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
