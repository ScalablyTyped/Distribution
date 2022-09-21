package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599Responses304Unknown401Content55403Content55 extends StObject {
  
  var parameters: Path599
  
  var responses: `304Unknown401Content55403Content55`
}
object ParametersPath599Responses304Unknown401Content55403Content55 {
  
  inline def apply(parameters: Path599, responses: `304Unknown401Content55403Content55`): ParametersPath599Responses304Unknown401Content55403Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599Responses304Unknown401Content55403Content55]
  }
  
  extension [Self <: ParametersPath599Responses304Unknown401Content55403Content55](x: Self) {
    
    inline def setParameters(value: Path599): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content55403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
