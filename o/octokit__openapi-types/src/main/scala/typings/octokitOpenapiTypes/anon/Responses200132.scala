package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200132 extends StObject {
  
  var parameters: PathTeamslug
  
  var responses: `200132`
}
object Responses200132 {
  
  inline def apply(parameters: PathTeamslug, responses: `200132`): Responses200132 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200132]
  }
  
  extension [Self <: Responses200132](x: Self) {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200132`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
