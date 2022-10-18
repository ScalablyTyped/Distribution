package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathColumnidNumber extends StObject {
  
  var parameters: PathColumnidNumber
  
  var responses: `200304401403404`
}
object ParametersPathColumnidNumber {
  
  inline def apply(parameters: PathColumnidNumber, responses: `200304401403404`): ParametersPathColumnidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathColumnidNumber]
  }
  
  extension [Self <: ParametersPathColumnidNumber](x: Self) {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
