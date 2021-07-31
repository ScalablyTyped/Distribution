package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Meteor.Error
import typings.meteor.anon.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  object HTTP {
    
    @JSImport("meteor/http", "HTTP")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def call(method: String, url: String): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def call(method: String, url: String, options: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def call(method: String, url: String, options: Auth): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def call(method: String, url: String, options: Auth, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def call(method: String, url: String, options: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def call(method: String, url: String, options: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    @scala.inline
    def del(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    @scala.inline
    def del(url: String, callOptions: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def del(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def del(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    @scala.inline
    def get(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    @scala.inline
    def get(url: String, callOptions: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def get(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def get(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    @scala.inline
    def post(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    @scala.inline
    def post(url: String, callOptions: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def post(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def post(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    @scala.inline
    def put(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    @scala.inline
    def put(url: String, callOptions: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def put(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    @scala.inline
    def put(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    type AsyncCallback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[HTTPResponse], Unit]
    
    trait HTTPRequest extends StObject {
      
      var auth: js.UndefOr[String] = js.undefined
      
      var content: js.UndefOr[String] = js.undefined
      
      var data: js.UndefOr[js.Any] = js.undefined
      
      var followRedirects: js.UndefOr[Boolean] = js.undefined
      
      var headers: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var params: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var query: js.UndefOr[String] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object HTTPRequest {
      
      @scala.inline
      def apply(): HTTPRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTTPRequest]
      }
      
      @scala.inline
      implicit class HTTPRequestMutableBuilder[Self <: HTTPRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
        
        @scala.inline
        def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    trait HTTPResponse extends StObject {
      
      var content: js.UndefOr[String] = js.undefined
      
      var data: js.UndefOr[js.Any] = js.undefined
      
      var headers: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var statusCode: js.UndefOr[Double] = js.undefined
    }
    object HTTPResponse {
      
      @scala.inline
      def apply(): HTTPResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTTPResponse]
      }
      
      @scala.inline
      implicit class HTTPResponseMutableBuilder[Self <: HTTPResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      }
    }
  }
}
