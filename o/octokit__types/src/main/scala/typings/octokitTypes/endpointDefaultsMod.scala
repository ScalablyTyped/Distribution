package typings.octokitTypes

import typings.octokitTypes.anon.Format
import typings.octokitTypes.anon.RequestHeadersacceptstrin
import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointDefaultsMod {
  
  trait EndpointDefaults
    extends StObject
       with RequestParameters {
    
    @JSName("baseUrl")
    var baseUrl_EndpointDefaults: Url
    
    @JSName("headers")
    var headers_EndpointDefaults: RequestHeadersacceptstrin
    
    @JSName("mediaType")
    var mediaType_EndpointDefaults: Format
    
    var method: RequestMethod
    
    var url: js.UndefOr[Url] = js.undefined
  }
  object EndpointDefaults {
    
    inline def apply(baseUrl: Url, headers: RequestHeadersacceptstrin, mediaType: Format, method: RequestMethod): EndpointDefaults = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointDefaults]
    }
    
    extension [Self <: EndpointDefaults](x: Self) {
      
      inline def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: RequestHeadersacceptstrin): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMediaType(value: Format): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
