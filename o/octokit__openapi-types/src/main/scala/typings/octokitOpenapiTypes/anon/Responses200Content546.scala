package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content546 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200Content546`
}
object Responses200Content546 {
  
  inline def apply(parameters: PathOwnerString, responses: `200Content546`): Responses200Content546 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content546]
  }
  
  extension [Self <: Responses200Content546](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content546`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
