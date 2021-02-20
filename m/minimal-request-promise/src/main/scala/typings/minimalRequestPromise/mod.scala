package typings.minimalRequestPromise

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimal-request-promise", JSImport.Namespace)
  @js.native
  def apply(callOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", JSImport.Namespace)
  @js.native
  def apply(callOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
  
  @JSImport("minimal-request-promise", "del")
  @js.native
  def del(url: String): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "del")
  @js.native
  def del(
    url: String,
    additionalOptions: js.UndefOr[scala.Nothing],
    PromiseImplementation: PromiseConstructor
  ): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "del")
  @js.native
  def del(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "del")
  @js.native
  def del(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
  
  @JSImport("minimal-request-promise", "delete")
  @js.native
  def delete(url: String): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "delete")
  @js.native
  def delete(
    url: String,
    additionalOptions: js.UndefOr[scala.Nothing],
    PromiseImplementation: PromiseConstructor
  ): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "delete")
  @js.native
  def delete(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "delete")
  @js.native
  def delete(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
  
  @JSImport("minimal-request-promise", "get")
  @js.native
  def get(url: String): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "get")
  @js.native
  def get(
    url: String,
    additionalOptions: js.UndefOr[scala.Nothing],
    PromiseImplementation: PromiseConstructor
  ): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "get")
  @js.native
  def get(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "get")
  @js.native
  def get(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
  
  @JSImport("minimal-request-promise", "post")
  @js.native
  def post(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "post")
  @js.native
  def post(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
  
  @JSImport("minimal-request-promise", "put")
  @js.native
  def put(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  @JSImport("minimal-request-promise", "put")
  @js.native
  def put(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
  
  @js.native
  trait MinimalRequestPromiseResponse extends StObject {
    
    var body: String = js.native
    
    var headers: js.Array[IncomingHttpHeaders] = js.native
    
    var statusCode: Double = js.native
    
    var statusMessage: String = js.native
  }
  object MinimalRequestPromiseResponse {
    
    @scala.inline
    def apply(body: String, headers: js.Array[IncomingHttpHeaders], statusCode: Double, statusMessage: String): MinimalRequestPromiseResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinimalRequestPromiseResponse]
    }
    
    @scala.inline
    implicit class MinimalRequestPromiseResponseMutableBuilder[Self <: MinimalRequestPromiseResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Array[IncomingHttpHeaders]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: IncomingHttpHeaders*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
}
