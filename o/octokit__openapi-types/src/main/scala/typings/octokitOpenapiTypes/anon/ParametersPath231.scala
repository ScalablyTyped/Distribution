package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath231 extends StObject {
  
  var parameters: Path231
  
  var responses: `200400422`
}
object ParametersPath231 {
  
  inline def apply(parameters: Path231, responses: `200400422`): ParametersPath231 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath231]
  }
  
  extension [Self <: ParametersPath231](x: Self) {
    
    inline def setParameters(value: Path231): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
