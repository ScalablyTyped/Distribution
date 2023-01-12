package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathThreadidNumberRequestBodyContentApplicationjsonIgnored extends StObject {
  
  var parameters: PathThreadidNumber
  
  var requestBody: ContentApplicationjsonIgnored
  
  var responses: `200ContentApplicationjsonRepositoryurl`
}
object ParametersPathThreadidNumberRequestBodyContentApplicationjsonIgnored {
  
  inline def apply(
    parameters: PathThreadidNumber,
    requestBody: ContentApplicationjsonIgnored,
    responses: `200ContentApplicationjsonRepositoryurl`
  ): ParametersPathThreadidNumberRequestBodyContentApplicationjsonIgnored = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathThreadidNumberRequestBodyContentApplicationjsonIgnored]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathThreadidNumberRequestBodyContentApplicationjsonIgnored] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathThreadidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIgnored): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoryurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
