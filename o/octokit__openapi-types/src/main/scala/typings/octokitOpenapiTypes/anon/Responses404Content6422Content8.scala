package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content6422Content8 extends StObject {
  
  var parameters: PathTeamid
  
  var responses: `404Content6422Content8`
}
object Responses404Content6422Content8 {
  
  inline def apply(parameters: PathTeamid, responses: `404Content6422Content8`): Responses404Content6422Content8 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content6422Content8]
  }
  
  extension [Self <: Responses404Content6422Content8](x: Self) {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
