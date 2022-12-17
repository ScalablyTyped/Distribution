package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content527 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200Content527`
}
object Responses200Content527 {
  
  inline def apply(parameters: PathOwnerString, responses: `200Content527`): Responses200Content527 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content527]
  }
  
  extension [Self <: Responses200Content527](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content527`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
