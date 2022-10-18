package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidNumberSecretname extends StObject {
  
  var parameters: PathRepositoryidNumberSecretname
  
  var responses: `621`
}
object ParametersPathRepositoryidNumberSecretname {
  
  inline def apply(parameters: PathRepositoryidNumberSecretname, responses: `621`): ParametersPathRepositoryidNumberSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidNumberSecretname]
  }
  
  extension [Self <: ParametersPathRepositoryidNumberSecretname](x: Self) {
    
    inline def setParameters(value: PathRepositoryidNumberSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `621`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
