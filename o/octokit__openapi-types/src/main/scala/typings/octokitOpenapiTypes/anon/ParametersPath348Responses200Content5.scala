package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348Responses200Content5 extends StObject {
  
  var parameters: Path348
  
  var responses: `200Content5`
}
object ParametersPath348Responses200Content5 {
  
  inline def apply(parameters: Path348, responses: `200Content5`): ParametersPath348Responses200Content5 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348Responses200Content5]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath348Responses200Content5] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path348): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content5`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
