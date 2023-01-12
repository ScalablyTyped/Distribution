package typings.openapiFactory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-factory", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with OpenApi {
    def this(options: ApiOptions) = this()
    def this(options: ApiOptions, overrideLogger: js.Function0[Unit]) = this()
  }
  
  trait ApiOptions extends StObject {
    
    var errorMiddleware: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var requestMiddleware: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var responseMiddleware: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object ApiOptions {
    
    inline def apply(): ApiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApiOptions] (val x: Self) extends AnyVal {
      
      inline def setErrorMiddleware(value: () => Any): Self = StObject.set(x, "errorMiddleware", js.Any.fromFunction0(value))
      
      inline def setErrorMiddlewareUndefined: Self = StObject.set(x, "errorMiddleware", js.undefined)
      
      inline def setRequestMiddleware(value: () => Any): Self = StObject.set(x, "requestMiddleware", js.Any.fromFunction0(value))
      
      inline def setRequestMiddlewareUndefined: Self = StObject.set(x, "requestMiddleware", js.undefined)
      
      inline def setResponseMiddleware(value: () => Any): Self = StObject.set(x, "responseMiddleware", js.Any.fromFunction0(value))
      
      inline def setResponseMiddlewareUndefined: Self = StObject.set(x, "responseMiddleware", js.undefined)
    }
  }
  
  trait HttpMethodOptions extends StObject {
    
    var rawBody: js.UndefOr[Boolean] = js.undefined
  }
  object HttpMethodOptions {
    
    inline def apply(): HttpMethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setRawBody(value: Boolean): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
      
      inline def setRawBodyUndefined: Self = StObject.set(x, "rawBody", js.undefined)
    }
  }
  
  trait HttpResponse extends StObject {
    
    var body: js.UndefOr[js.Object | String] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object HttpResponse {
    
    inline def apply(): HttpResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
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
    
    def handler(event: js.Object, context: js.Object): js.Promise[Any] = js.native
    
    def head(
      route: String,
      handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
    ): Unit = js.native
    def head(route: String, options: HttpMethodOptions, handler: js.Function1[/* req */ js.UndefOr[Any], Any]): Unit = js.native
    
    def onEvent(onEventFunc: js.Function1[/* req */ js.UndefOr[Any], js.Promise[Any]]): Unit = js.native
    
    def onSchedule(onScheduleFunc: js.Function1[/* req */ js.UndefOr[Any], js.Promise[Any]]): Unit = js.native
    
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
    
    def setAuthorizer(authorizerFunc: js.Function1[/* req */ js.UndefOr[Any], js.Promise[Any]]): Unit = js.native
  }
}
