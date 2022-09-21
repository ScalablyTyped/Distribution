package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200122 extends StObject {
  
  var parameters: PathTeamslug
  
  var responses: `200122`
}
object Responses200122 {
  
  inline def apply(parameters: PathTeamslug, responses: `200122`): Responses200122 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200122]
  }
  
  extension [Self <: Responses200122](x: Self) {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200122`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
