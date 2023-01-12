package typings.octokitTypes

import typings.octokitTypes.distTypesRequestHeadersMod.RequestHeaders
import typings.octokitTypes.distTypesRequestMethodMod.RequestMethod
import typings.octokitTypes.distTypesRequestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.distTypesUrlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRequestOptionsMod {
  
  trait RequestOptions extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: RequestHeaders
    
    var method: RequestMethod
    
    var request: js.UndefOr[RequestRequestOptions] = js.undefined
    
    var url: Url
  }
  object RequestOptions {
    
    inline def apply(headers: RequestHeaders, method: RequestMethod, url: Url): RequestOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
