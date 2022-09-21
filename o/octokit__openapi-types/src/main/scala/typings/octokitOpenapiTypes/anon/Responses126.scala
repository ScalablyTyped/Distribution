package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses126 extends StObject {
  
  var parameters: PathOrgTeamslug
  
  var responses: `126`
}
object Responses126 {
  
  inline def apply(parameters: PathOrgTeamslug, responses: `126`): Responses126 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses126]
  }
  
  extension [Self <: Responses126](x: Self) {
    
    inline def setParameters(value: PathOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `126`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
