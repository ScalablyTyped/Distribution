package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameRepositoryidSecretname extends StObject {
  
  var parameters: PathEnvironmentnameRepositoryidSecretname
  
  var responses: `200Content164`
}
object ParametersPathEnvironmentnameRepositoryidSecretname {
  
  inline def apply(parameters: PathEnvironmentnameRepositoryidSecretname, responses: `200Content164`): ParametersPathEnvironmentnameRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameRepositoryidSecretname]
  }
  
  extension [Self <: ParametersPathEnvironmentnameRepositoryidSecretname](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content164`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
