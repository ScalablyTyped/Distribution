package typings.minimalRequestPromise

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(callOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = ^.asInstanceOf[js.Dynamic].apply(callOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def apply(callOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].apply(callOptions.asInstanceOf[js.Any], PromiseImplementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  
  @JSImport("minimal-request-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def del(url: String): js.Promise[MinimalRequestPromiseResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def del(url: String, additionalOptions: Unit, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any], PromiseImplementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def del(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def del(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any], PromiseImplementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  
  inline def delete(url: String): js.Promise[MinimalRequestPromiseResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def delete(url: String, additionalOptions: Unit, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any], PromiseImplementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def delete(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def delete(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any], PromiseImplementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  
  inline def get(url: String): js.Promise[MinimalRequestPromiseResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def get(url: String, additionalOptions: Unit, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any], PromiseImplementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def get(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def get(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any], PromiseImplementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  
  inline def post(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def post(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any], PromiseImplementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  
  inline def put(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  inline def put(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any], PromiseImplementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimalRequestPromiseResponse]]
  
  trait MinimalRequestPromiseResponse extends StObject {
    
    var body: String
    
    var headers: js.Array[IncomingHttpHeaders]
    
    var statusCode: Double
    
    var statusMessage: String
  }
  object MinimalRequestPromiseResponse {
    
    inline def apply(body: String, headers: js.Array[IncomingHttpHeaders], statusCode: Double, statusMessage: String): MinimalRequestPromiseResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinimalRequestPromiseResponse]
    }
    
    extension [Self <: MinimalRequestPromiseResponse](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Array[IncomingHttpHeaders]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: IncomingHttpHeaders*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
}
