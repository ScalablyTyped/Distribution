package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath294 extends StObject {
  
  var parameters: Path294
  
  var responses: `200Content295`
}
object ParametersPath294 {
  
  inline def apply(parameters: Path294, responses: `200Content295`): ParametersPath294 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath294]
  }
  
  extension [Self <: ParametersPath294](x: Self) {
    
    inline def setParameters(value: Path294): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content295`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
