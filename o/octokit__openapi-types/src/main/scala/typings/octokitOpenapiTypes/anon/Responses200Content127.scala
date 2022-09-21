package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content127 extends StObject {
  
  var parameters: PathTeamslugQueryPage
  
  var responses: `200Content127`
}
object Responses200Content127 {
  
  inline def apply(parameters: PathTeamslugQueryPage, responses: `200Content127`): Responses200Content127 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content127]
  }
  
  extension [Self <: Responses200Content127](x: Self) {
    
    inline def setParameters(value: PathTeamslugQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content127`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
