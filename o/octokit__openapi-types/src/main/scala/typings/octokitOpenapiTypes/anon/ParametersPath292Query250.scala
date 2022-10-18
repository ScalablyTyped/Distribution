package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292Query250 extends StObject {
  
  var parameters: Path292Query250
  
  var responses: `200ContentApplicationjsonCodespacesTotalcount`
}
object ParametersPath292Query250 {
  
  inline def apply(parameters: Path292Query250, responses: `200ContentApplicationjsonCodespacesTotalcount`): ParametersPath292Query250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292Query250]
  }
  
  extension [Self <: ParametersPath292Query250](x: Self) {
    
    inline def setParameters(value: Path292Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCodespacesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
