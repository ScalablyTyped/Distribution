package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidNumber extends StObject {
  
  var parameters: PathRepositoryidNumber
  
  var responses: `355`
}
object ParametersPathRepositoryidNumber {
  
  inline def apply(parameters: PathRepositoryidNumber, responses: `355`): ParametersPathRepositoryidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidNumber]
  }
  
  extension [Self <: ParametersPathRepositoryidNumber](x: Self) {
    
    inline def setParameters(value: PathRepositoryidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `355`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
