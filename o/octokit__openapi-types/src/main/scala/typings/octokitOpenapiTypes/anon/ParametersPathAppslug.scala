package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAppslug extends StObject {
  
  var parameters: PathAppslug
  
  var responses: `200403`
}
object ParametersPathAppslug {
  
  inline def apply(parameters: PathAppslug, responses: `200403`): ParametersPathAppslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAppslug]
  }
  
  extension [Self <: ParametersPathAppslug](x: Self) {
    
    inline def setParameters(value: PathAppslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
