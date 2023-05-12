package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchpolicyidEnvironmentnameRequestBodyContentApplicationjsonName extends StObject {
  
  var parameters: PathBranchpolicyidEnvironmentname
  
  var requestBody: ContentApplicationjsonName
  
  var responses: `200ContentApplicationjsonNameNodeid`
}
object ParametersPathBranchpolicyidEnvironmentnameRequestBodyContentApplicationjsonName {
  
  inline def apply(
    parameters: PathBranchpolicyidEnvironmentname,
    requestBody: ContentApplicationjsonName,
    responses: `200ContentApplicationjsonNameNodeid`
  ): ParametersPathBranchpolicyidEnvironmentnameRequestBodyContentApplicationjsonName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchpolicyidEnvironmentnameRequestBodyContentApplicationjsonName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchpolicyidEnvironmentnameRequestBodyContentApplicationjsonName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchpolicyidEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNameNodeid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
