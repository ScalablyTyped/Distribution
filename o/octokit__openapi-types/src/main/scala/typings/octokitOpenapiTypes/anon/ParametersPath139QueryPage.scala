package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath139QueryPage extends StObject {
  
  var parameters: Path139QueryPage
  
  var responses: `200Content142`
}
object ParametersPath139QueryPage {
  
  inline def apply(parameters: Path139QueryPage, responses: `200Content142`): ParametersPath139QueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath139QueryPage]
  }
  
  extension [Self <: ParametersPath139QueryPage](x: Self) {
    
    inline def setParameters(value: Path139QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content142`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
