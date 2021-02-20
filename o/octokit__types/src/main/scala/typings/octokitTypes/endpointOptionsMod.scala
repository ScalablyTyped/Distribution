package typings.octokitTypes

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.anon.Format
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointOptionsMod {
  
  /* Inlined @octokit/types.@octokit/types/dist-types/RequestParameters.RequestParameters & {  method :@octokit/types.@octokit/types/dist-types/RequestMethod.RequestMethod,   url :@octokit/types.@octokit/types/dist-types/Url.Url} */
  @js.native
  trait EndpointOptions
    extends /**
    * Any additional parameter will be passed as follows
    * 1. URL parameter if `':parameter'` or `{parameter}` is part of `url`
    * 2. Query parameter if `method` is `'GET'` or `'HEAD'`
    * 3. Request body if `parameter` is `'data'`
    * 4. JSON in the request body in the form of `body[parameter]` unless `parameter` key is `'data'`
    */
  /* parameter */ StringDictionary[js.Any] {
    
    /**
      * Base URL to be used when a relative URL is passed, such as `/orgs/:org`.
      * If `baseUrl` is `https://enterprise.acme-inc.com/api/v3`, then the request
      * will be sent to `https://enterprise.acme-inc.com/api/v3/orgs/:org`.
      */
    var baseUrl: js.UndefOr[Url] = js.native
    
    /**
      * HTTP headers. Use lowercase keys.
      */
    var headers: js.UndefOr[RequestHeaders] = js.native
    
    /**
      * Media type options, see {@link https://developer.github.com/v3/media/|GitHub Developer Guide}
      */
    var mediaType: js.UndefOr[Format] = js.native
    
    var method: RequestMethod = js.native
    
    /**
      * Pass custom meta information for the request. The `request` object will be returned as is.
      */
    var request: js.UndefOr[RequestRequestOptions] = js.native
    
    var url: Url = js.native
  }
  object EndpointOptions {
    
    @scala.inline
    def apply(method: RequestMethod, url: Url): EndpointOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointOptions]
    }
    
    @scala.inline
    implicit class EndpointOptionsMutableBuilder[Self <: EndpointOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMediaType(value: Format): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
