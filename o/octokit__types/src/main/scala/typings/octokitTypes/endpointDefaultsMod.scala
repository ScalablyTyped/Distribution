package typings.octokitTypes

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.anon.Format
import typings.octokitTypes.anon.Previews
import typings.octokitTypes.anon.RequestHeadersacceptstrin
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointDefaultsMod {
  
  /* Inlined @octokit/types.@octokit/types/dist-types/RequestParameters.RequestParameters & {  baseUrl :@octokit/types.@octokit/types/dist-types/Url.Url,   method :@octokit/types.@octokit/types/dist-types/RequestMethod.RequestMethod,   url :@octokit/types.@octokit/types/dist-types/Url.Url | undefined,   headers :@octokit/types.@octokit/types/dist-types/RequestHeaders.RequestHeaders & {  accept :string,   user-agent :string},   mediaType :{  format :string,   previews :std.Array<string>}} */
  @js.native
  trait EndpointDefaults
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
    var baseUrl: js.UndefOr[Url] with Url = js.native
    
    /**
      * HTTP headers. Use lowercase keys.
      */
    var headers: js.UndefOr[RequestHeaders] with RequestHeadersacceptstrin = js.native
    
    /**
      * Media type options, see {@link https://developer.github.com/v3/media/|GitHub Developer Guide}
      */
    var mediaType: js.UndefOr[Format] with Previews = js.native
    
    var method: RequestMethod = js.native
    
    /**
      * Pass custom meta information for the request. The `request` object will be returned as is.
      */
    var request: js.UndefOr[RequestRequestOptions] = js.native
    
    var url: js.UndefOr[Url] = js.native
  }
  object EndpointDefaults {
    
    @scala.inline
    def apply(
      baseUrl: js.UndefOr[Url] with Url,
      headers: js.UndefOr[RequestHeaders] with RequestHeadersacceptstrin,
      mediaType: js.UndefOr[Format] with Previews,
      method: RequestMethod
    ): EndpointDefaults = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointDefaults]
    }
    
    @scala.inline
    implicit class EndpointDefaultsMutableBuilder[Self <: EndpointDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: js.UndefOr[Url] with Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.UndefOr[RequestHeaders] with RequestHeadersacceptstrin): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaType(value: js.UndefOr[Format] with Previews): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
