package typings.octokitRequestError

import typings.octokitRequestError.typesMod.RequestErrorOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Headers
    extends StObject
       with RequestErrorOptions {
    
    /** @deprecated set `response` instead */
    var headers: js.UndefOr[ResponseHeaders] = js.undefined
    
    var request: RequestOptions
  }
  object Headers {
    
    inline def apply(request: RequestOptions): Headers = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: ResponseHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setRequest(value: RequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request
    extends StObject
       with RequestErrorOptions {
    
    var request: RequestOptions
    
    var response: OctokitResponse[Any, Double]
  }
  object Request {
    
    inline def apply(request: RequestOptions, response: OctokitResponse[Any, Double]): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setRequest(value: RequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: OctokitResponse[Any, Double]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
