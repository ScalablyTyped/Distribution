package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Meteor.Error
import typings.meteor.anon.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  object HTTP {
    
    @JSImport("meteor/http", "HTTP.call")
    @js.native
    def call(method: String, url: String): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.call")
    @js.native
    def call(method: String, url: String, options: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.call")
    @js.native
    def call(method: String, url: String, options: Auth): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.call")
    @js.native
    def call(method: String, url: String, options: Auth, asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.call")
    @js.native
    def call(method: String, url: String, options: HTTPRequest): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.call")
    @js.native
    def call(method: String, url: String, options: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
    
    @JSImport("meteor/http", "HTTP.del")
    @js.native
    def del(url: String): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.del")
    @js.native
    def del(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.del")
    @js.native
    def del(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.del")
    @js.native
    def del(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
    
    @JSImport("meteor/http", "HTTP.get")
    @js.native
    def get(url: String): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.get")
    @js.native
    def get(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.get")
    @js.native
    def get(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.get")
    @js.native
    def get(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
    
    @JSImport("meteor/http", "HTTP.post")
    @js.native
    def post(url: String): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.post")
    @js.native
    def post(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.post")
    @js.native
    def post(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.post")
    @js.native
    def post(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
    
    @JSImport("meteor/http", "HTTP.put")
    @js.native
    def put(url: String): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.put")
    @js.native
    def put(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.put")
    @js.native
    def put(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
    @JSImport("meteor/http", "HTTP.put")
    @js.native
    def put(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
    
    type AsyncCallback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[HTTPResponse], Unit]
    
    @js.native
    trait HTTPRequest extends StObject {
      
      var auth: js.UndefOr[String] = js.native
      
      var content: js.UndefOr[String] = js.native
      
      var data: js.UndefOr[js.Any] = js.native
      
      var followRedirects: js.UndefOr[Boolean] = js.native
      
      var headers: js.UndefOr[StringDictionary[String]] = js.native
      
      var params: js.UndefOr[StringDictionary[String]] = js.native
      
      var query: js.UndefOr[String] = js.native
      
      var timeout: js.UndefOr[Double] = js.native
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
    
    @js.native
    trait HTTPResponse extends StObject {
      
      var content: js.UndefOr[String] = js.native
      
      var data: js.UndefOr[js.Any] = js.native
      
      var headers: js.UndefOr[StringDictionary[String]] = js.native
      
      var statusCode: js.UndefOr[Double] = js.native
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
