package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonMaintainercanmodify extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonMaintainercanmodify
  
  var responses: `201ContentApplicationjsonChangedfiles`
}
object RequestBodyContentApplicationjsonMaintainercanmodify {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonMaintainercanmodify,
    responses: `201ContentApplicationjsonChangedfiles`
  ): RequestBodyContentApplicationjsonMaintainercanmodify = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonMaintainercanmodify]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonMaintainercanmodify](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMaintainercanmodify): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonChangedfiles`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
