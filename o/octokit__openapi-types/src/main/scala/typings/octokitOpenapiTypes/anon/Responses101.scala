package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses101 extends StObject {
  
  var parameters: PathTeamslugQueryPage
  
  var responses: `101`
}
object Responses101 {
  
  inline def apply(parameters: PathTeamslugQueryPage, responses: `101`): Responses101 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses101]
  }
  
  extension [Self <: Responses101](x: Self) {
    
    inline def setParameters(value: PathTeamslugQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `101`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
