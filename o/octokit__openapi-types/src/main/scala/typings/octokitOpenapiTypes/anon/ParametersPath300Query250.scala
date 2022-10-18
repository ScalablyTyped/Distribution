package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath300Query250 extends StObject {
  
  var parameters: Path300Query250
  
  var responses: `304401403404500`
}
object ParametersPath300Query250 {
  
  inline def apply(parameters: Path300Query250, responses: `304401403404500`): ParametersPath300Query250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath300Query250]
  }
  
  extension [Self <: ParametersPath300Query250](x: Self) {
    
    inline def setParameters(value: Path300Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
