package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath444Responses200Content131 extends StObject {
  
  var parameters: Path444
  
  var responses: `200Content131`
}
object ParametersPath444Responses200Content131 {
  
  inline def apply(parameters: Path444, responses: `200Content131`): ParametersPath444Responses200Content131 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath444Responses200Content131]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath444Responses200Content131] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content131`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
