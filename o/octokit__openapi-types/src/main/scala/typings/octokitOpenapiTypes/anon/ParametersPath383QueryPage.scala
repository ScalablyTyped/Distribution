package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath383QueryPage extends StObject {
  
  var parameters: Path383QueryPage
  
  var responses: `200Content101`
}
object ParametersPath383QueryPage {
  
  inline def apply(parameters: Path383QueryPage, responses: `200Content101`): ParametersPath383QueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath383QueryPage]
  }
  
  extension [Self <: ParametersPath383QueryPage](x: Self) {
    
    inline def setParameters(value: Path383QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content101`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
