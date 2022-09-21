package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses475 extends StObject {
  
  var parameters: PathTeamslugStringQuery426
  
  var responses: `475`
}
object Responses475 {
  
  inline def apply(parameters: PathTeamslugStringQuery426, responses: `475`): Responses475 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses475]
  }
  
  extension [Self <: Responses475](x: Self) {
    
    inline def setParameters(value: PathTeamslugStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `475`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
