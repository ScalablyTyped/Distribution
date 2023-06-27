package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath444 extends StObject {
  
  var parameters: Path444
  
  var responses: `403404Content41`
}
object ParametersPath444 {
  
  inline def apply(parameters: Path444, responses: `403404Content41`): ParametersPath444 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath444]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath444] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
