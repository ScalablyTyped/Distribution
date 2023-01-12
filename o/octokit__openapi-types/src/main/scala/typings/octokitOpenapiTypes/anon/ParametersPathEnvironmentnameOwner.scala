package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwner extends StObject {
  
  var parameters: PathEnvironmentnameOwner
  
  var responses: `200ContentApplicationjsonCreatedatDeploymentbranchpolicy`
}
object ParametersPathEnvironmentnameOwner {
  
  inline def apply(
    parameters: PathEnvironmentnameOwner,
    responses: `200ContentApplicationjsonCreatedatDeploymentbranchpolicy`
  ): ParametersPathEnvironmentnameOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatDeploymentbranchpolicy`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
