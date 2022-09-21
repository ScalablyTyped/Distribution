package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses133 extends StObject {
  
  var parameters: PathTeamslugQueryPage
  
  var responses: `133`
}
object Responses133 {
  
  inline def apply(parameters: PathTeamslugQueryPage, responses: `133`): Responses133 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses133]
  }
  
  extension [Self <: Responses133](x: Self) {
    
    inline def setParameters(value: PathTeamslugQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `133`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
