package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses118 extends StObject {
  
  var parameters: PathOrgTeamslug
  
  var responses: `118`
}
object Responses118 {
  
  inline def apply(parameters: PathOrgTeamslug, responses: `118`): Responses118 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses118]
  }
  
  extension [Self <: Responses118](x: Self) {
    
    inline def setParameters(value: PathOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `118`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
