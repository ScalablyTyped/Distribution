package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReponameString extends StObject {
  
  var parameters: PathReponameString
  
  var responses: `401Content41403Content41404Content41`
}
object ParametersPathReponameString {
  
  inline def apply(parameters: PathReponameString, responses: `401Content41403Content41404Content41`): ParametersPathReponameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReponameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathReponameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReponameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content41403Content41404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
