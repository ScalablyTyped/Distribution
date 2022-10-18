package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content343401 extends StObject {
  
  var parameters: Path622
  
  var responses: `200Content343401`
}
object Responses200Content343401 {
  
  inline def apply(parameters: Path622, responses: `200Content343401`): Responses200Content343401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content343401]
  }
  
  extension [Self <: Responses200Content343401](x: Self) {
    
    inline def setParameters(value: Path622): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content343401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
