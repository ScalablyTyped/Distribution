package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRepo extends StObject {
  
  var parameters: PathOrgRepo
  
  var responses: `200ContentApplicationjsonRequiredworkflowsTotalcount`
}
object ParametersPathOrgRepo {
  
  inline def apply(parameters: PathOrgRepo, responses: `200ContentApplicationjsonRequiredworkflowsTotalcount`): ParametersPathOrgRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRequiredworkflowsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
