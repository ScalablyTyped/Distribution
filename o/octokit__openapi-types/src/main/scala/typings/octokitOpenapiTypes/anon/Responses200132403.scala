package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200132403 extends StObject {
  
  var parameters: PathTeamid
  
  var responses: `200132403`
}
object Responses200132403 {
  
  inline def apply(parameters: PathTeamid, responses: `200132403`): Responses200132403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200132403]
  }
  
  extension [Self <: Responses200132403](x: Self) {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200132403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
