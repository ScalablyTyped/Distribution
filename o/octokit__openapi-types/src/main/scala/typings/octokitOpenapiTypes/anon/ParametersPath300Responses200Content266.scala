package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath300Responses200Content266 extends StObject {
  
  var parameters: Path300
  
  var responses: `200Content266`
}
object ParametersPath300Responses200Content266 {
  
  inline def apply(parameters: Path300, responses: `200Content266`): ParametersPath300Responses200Content266 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath300Responses200Content266]
  }
  
  extension [Self <: ParametersPath300Responses200Content266](x: Self) {
    
    inline def setParameters(value: Path300): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content266`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
