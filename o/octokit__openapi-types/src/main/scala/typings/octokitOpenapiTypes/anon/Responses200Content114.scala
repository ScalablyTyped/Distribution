package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content114 extends StObject {
  
  var parameters: PathTeamslug
  
  var responses: `200Content114`
}
object Responses200Content114 {
  
  inline def apply(parameters: PathTeamslug, responses: `200Content114`): Responses200Content114 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content114]
  }
  
  extension [Self <: Responses200Content114](x: Self) {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content114`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
