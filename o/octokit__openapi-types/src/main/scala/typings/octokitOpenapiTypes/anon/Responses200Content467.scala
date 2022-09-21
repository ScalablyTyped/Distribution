package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content467 extends StObject {
  
  var parameters: PathTeamidNumberQuery426
  
  var responses: `200Content467`
}
object Responses200Content467 {
  
  inline def apply(parameters: PathTeamidNumberQuery426, responses: `200Content467`): Responses200Content467 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content467]
  }
  
  extension [Self <: Responses200Content467](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content467`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
