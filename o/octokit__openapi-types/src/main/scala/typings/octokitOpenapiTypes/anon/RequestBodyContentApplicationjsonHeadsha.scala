package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonHeadsha extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonHeadsha
  
  var responses: `200ContentApplicationjsonCheckrunsurl`
}
object RequestBodyContentApplicationjsonHeadsha {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonHeadsha,
    responses: `200ContentApplicationjsonCheckrunsurl`
  ): RequestBodyContentApplicationjsonHeadsha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonHeadsha]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonHeadsha](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonHeadsha): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckrunsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
