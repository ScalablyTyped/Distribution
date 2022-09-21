package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseScimuseridRequestBodyContentApplicationjsonSchemas extends StObject {
  
  var parameters: PathEnterpriseScimuserid
  
  var requestBody: ContentApplicationjsonSchemas
  
  var responses: `200ContentApplicationjsonEmailsExternalId`
}
object ParametersPathEnterpriseScimuseridRequestBodyContentApplicationjsonSchemas {
  
  inline def apply(
    parameters: PathEnterpriseScimuserid,
    requestBody: ContentApplicationjsonSchemas,
    responses: `200ContentApplicationjsonEmailsExternalId`
  ): ParametersPathEnterpriseScimuseridRequestBodyContentApplicationjsonSchemas = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseScimuseridRequestBodyContentApplicationjsonSchemas]
  }
  
  extension [Self <: ParametersPathEnterpriseScimuseridRequestBodyContentApplicationjsonSchemas](x: Self) {
    
    inline def setParameters(value: PathEnterpriseScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSchemas): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEmailsExternalId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
