package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryEnvironment extends StObject {
  
  var parameters: QueryEnvironment
  
  var responses: `200Content152Headers`
}
object ParametersQueryEnvironment {
  
  inline def apply(parameters: QueryEnvironment, responses: `200Content152Headers`): ParametersQueryEnvironment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryEnvironment]
  }
  
  extension [Self <: ParametersQueryEnvironment](x: Self) {
    
    inline def setParameters(value: QueryEnvironment): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content152Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
