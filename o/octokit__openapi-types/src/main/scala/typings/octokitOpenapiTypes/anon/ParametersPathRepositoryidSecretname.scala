package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidSecretname extends StObject {
  
  var parameters: PathRepositoryidSecretname
  
  var responses: `409Unknown`
}
object ParametersPathRepositoryidSecretname {
  
  inline def apply(parameters: PathRepositoryidSecretname, responses: `409Unknown`): ParametersPathRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidSecretname]
  }
  
  extension [Self <: ParametersPathRepositoryidSecretname](x: Self) {
    
    inline def setParameters(value: PathRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
