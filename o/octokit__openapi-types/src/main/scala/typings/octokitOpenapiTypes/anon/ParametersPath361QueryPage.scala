package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361QueryPage extends StObject {
  
  var parameters: Path361QueryPage
  
  var responses: `200Content35`
}
object ParametersPath361QueryPage {
  
  inline def apply(parameters: Path361QueryPage, responses: `200Content35`): ParametersPath361QueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361QueryPage]
  }
  
  extension [Self <: ParametersPath361QueryPage](x: Self) {
    
    inline def setParameters(value: Path361QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content35`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
