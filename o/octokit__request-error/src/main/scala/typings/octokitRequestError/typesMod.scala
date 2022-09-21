package typings.octokitRequestError

import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestOptionsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.octokitRequestError.anon.Headers
    - typings.octokitRequestError.anon.Request
  */
  trait RequestErrorOptions extends StObject
  object RequestErrorOptions {
    
    inline def Headers(request: RequestOptions): typings.octokitRequestError.anon.Headers = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.octokitRequestError.anon.Headers]
    }
    
    inline def Request(request: RequestOptions, response: OctokitResponse[Any, Double]): typings.octokitRequestError.anon.Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.octokitRequestError.anon.Request]
    }
  }
}
