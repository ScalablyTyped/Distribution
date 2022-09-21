package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReponameString extends StObject {
  
  var parameters: PathReponameString
  
  var responses: `401Content55403Content55404Content55`
}
object ParametersPathReponameString {
  
  inline def apply(parameters: PathReponameString, responses: `401Content55403Content55404Content55`): ParametersPathReponameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReponameString]
  }
  
  extension [Self <: ParametersPathReponameString](x: Self) {
    
    inline def setParameters(value: PathReponameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content55403Content55404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
