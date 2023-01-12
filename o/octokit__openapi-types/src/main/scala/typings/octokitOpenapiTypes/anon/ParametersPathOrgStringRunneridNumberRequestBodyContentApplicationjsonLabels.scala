package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringRunneridNumberRequestBodyContentApplicationjsonLabels extends StObject {
  
  var parameters: PathOrgStringRunneridNumber
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `422Content395`
}
object ParametersPathOrgStringRunneridNumberRequestBodyContentApplicationjsonLabels {
  
  inline def apply(
    parameters: PathOrgStringRunneridNumber,
    requestBody: ContentApplicationjsonLabels,
    responses: `422Content395`
  ): ParametersPathOrgStringRunneridNumberRequestBodyContentApplicationjsonLabels = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringRunneridNumberRequestBodyContentApplicationjsonLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgStringRunneridNumberRequestBodyContentApplicationjsonLabels] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content395`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
