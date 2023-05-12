package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwnerRepo extends StObject {
  
  var parameters: PathEnvironmentnameOwnerRepo
  
  var responses: `200ContentApplicationjsonCreatedatDeploymentbranchpolicy`
}
object ParametersPathEnvironmentnameOwnerRepo {
  
  inline def apply(
    parameters: PathEnvironmentnameOwnerRepo,
    responses: `200ContentApplicationjsonCreatedatDeploymentbranchpolicy`
  ): ParametersPathEnvironmentnameOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatDeploymentbranchpolicy`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
