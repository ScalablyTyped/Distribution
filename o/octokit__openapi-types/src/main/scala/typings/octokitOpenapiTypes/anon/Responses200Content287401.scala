package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content287401 extends StObject {
  
  var parameters: Path286
  
  var responses: `200Content287401`
}
object Responses200Content287401 {
  
  inline def apply(parameters: Path286, responses: `200Content287401`): Responses200Content287401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content287401]
  }
  
  extension [Self <: Responses200Content287401](x: Self) {
    
    inline def setParameters(value: Path286): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content287401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
