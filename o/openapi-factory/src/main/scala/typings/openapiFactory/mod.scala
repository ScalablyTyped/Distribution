package typings.openapiFactory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-factory", JSImport.Namespace)
  @js.native
  class ^ protected () extends OpenApi {
    def this(options: ApiOptions) = this()
    def this(options: ApiOptions, overrideLogger: js.Function0[Unit]) = this()
  }
  
  @js.native
  trait ApiOptions extends StObject {
    
    var errorMiddleware: js.UndefOr[js.Function0[_]] = js.native
    
    var requestMiddleware: js.UndefOr[js.Function0[_]] = js.native
    
    var responseMiddleware: js.UndefOr[js.Function0[_]] = js.native
  }
  object ApiOptions {
    
    @scala.inline
    def apply(): ApiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiOptions]
    }
    
    @scala.inline
    implicit class ApiOptionsMutableBuilder[Self <: ApiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorMiddleware(value: () => _): Self = StObject.set(x, "errorMiddleware", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrorMiddlewareUndefined: Self = StObject.set(x, "errorMiddleware", js.undefined)
      
      @scala.inline
      def setRequestMiddleware(value: () => _): Self = StObject.set(x, "requestMiddleware", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequestMiddlewareUndefined: Self = StObject.set(x, "requestMiddleware", js.undefined)
      
      @scala.inline
      def setResponseMiddleware(value: () => _): Self = StObject.set(x, "responseMiddleware", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResponseMiddlewareUndefined: Self = StObject.set(x, "responseMiddleware", js.undefined)
    }
  }
  
  @js.native
  trait HttpMethodOptions extends StObject {
    
    var rawBody: js.UndefOr[Boolean] = js.native
  }
  object HttpMethodOptions {
    
    @scala.inline
    def apply(): HttpMethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpMethodOptions]
    }
    
    @scala.inline
    implicit class HttpMethodOptionsMutableBuilder[Self <: HttpMethodOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawBody(value: Boolean): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawBodyUndefined: Self = StObject.set(x, "rawBody", js.undefined)
    }
  }
  
  @js.native
  trait HttpResponse extends StObject {
    
    var body: js.UndefOr[js.Object | String] = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  object HttpResponse {
    
    @scala.inline
    def apply(): HttpResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpResponse]
    }
    
    @scala.inline
    implicit class HttpResponseMutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  @js.native
  trait OpenApi extends StObject {
    
    def any(
      route: String,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    def any(
      route: String,
      options: HttpMethodOptions,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    
    def delete(
      route: String,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    def delete(
      route: String,
      options: HttpMethodOptions,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    
    def get(
      route: String,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    def get(
      route: String,
      options: HttpMethodOptions,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    
    def handler(event: js.Object, context: js.Object): js.Promise[_] = js.native
    
    def head(
      route: String,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    def head(route: String, options: HttpMethodOptions, handler: js.Function1[/* req */ js.UndefOr[js.Any], _]): Unit = js.native
    
    def onEvent(onEventFunc: js.Function1[/* req */ js.UndefOr[js.Any], js.Promise[_]]): Unit = js.native
    
    def onSchedule(onScheduleFunc: js.Function1[/* req */ js.UndefOr[js.Any], js.Promise[_]]): Unit = js.native
    
    def options(
      route: String,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    def options(
      route: String,
      options: HttpMethodOptions,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    
    def patch(
      route: String,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    def patch(
      route: String,
      options: HttpMethodOptions,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    
    def post(
      route: String,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    def post(
      route: String,
      options: HttpMethodOptions,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    
    def put(
      route: String,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    def put(
      route: String,
      options: HttpMethodOptions,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    
    def setAuthorizer(authorizerFunc: js.Function1[/* req */ js.UndefOr[js.Any], js.Promise[_]]): Unit = js.native
  }
}
