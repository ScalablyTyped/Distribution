package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses109 extends StObject {
  
  var parameters: PathTeamslugQueryPage
  
  var responses: `109`
}
object Responses109 {
  
  inline def apply(parameters: PathTeamslugQueryPage, responses: `109`): Responses109 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses109]
  }
  
  extension [Self <: Responses109](x: Self) {
    
    inline def setParameters(value: PathTeamslugQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `109`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
