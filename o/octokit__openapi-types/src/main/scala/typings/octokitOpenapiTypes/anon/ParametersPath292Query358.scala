package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292Query358 extends StObject {
  
  var parameters: Path292Query358
  
  var responses: `200401403404410`
}
object ParametersPath292Query358 {
  
  inline def apply(parameters: Path292Query358, responses: `200401403404410`): ParametersPath292Query358 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292Query358]
  }
  
  extension [Self <: ParametersPath292Query358](x: Self) {
    
    inline def setParameters(value: Path292Query358): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
