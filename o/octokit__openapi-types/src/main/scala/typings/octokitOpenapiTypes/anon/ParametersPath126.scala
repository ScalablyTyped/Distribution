package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath126 extends StObject {
  
  var parameters: Path126
  
  var responses: `200304401403404`
}
object ParametersPath126 {
  
  inline def apply(parameters: Path126, responses: `200304401403404`): ParametersPath126 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath126]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath126] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path126): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
