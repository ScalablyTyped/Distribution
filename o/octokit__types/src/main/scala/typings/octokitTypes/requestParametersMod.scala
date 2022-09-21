package typings.octokitTypes

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.anon.Previews
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestParametersMod {
  
  trait RequestParameters
    extends StObject
       with /* option */ StringDictionary[Any] {
    
    /**
      * Base URL to be used when a relative URL is passed, such as `/orgs/{org}`.
      * If `baseUrl` is `https://enterprise.acme-inc.com/api/v3`, then the request
      * will be sent to `https://enterprise.acme-inc.com/api/v3/orgs/{org}`.
      */
    var baseUrl: js.UndefOr[Url] = js.undefined
    
    /**
      * HTTP headers. Use lowercase keys.
      */
    var headers: js.UndefOr[RequestHeaders] = js.undefined
    
    /**
      * Media type options, see {@link https://developer.github.com/v3/media/|GitHub Developer Guide}
      */
    var mediaType: js.UndefOr[Previews] = js.undefined
    
    /**
      * Pass custom meta information for the request. The `request` object will be returned as is.
      */
    var request: js.UndefOr[RequestRequestOptions] = js.undefined
  }
  object RequestParameters {
    
    inline def apply(): RequestParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestParameters]
    }
    
    extension [Self <: RequestParameters](x: Self) {
      
      inline def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMediaType(value: Previews): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
}
