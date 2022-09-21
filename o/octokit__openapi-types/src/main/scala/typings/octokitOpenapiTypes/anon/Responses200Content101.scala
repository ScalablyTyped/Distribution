package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content101 extends StObject {
  
  var parameters: PathTeamidQueryPage
  
  var responses: `200Content101`
}
object Responses200Content101 {
  
  inline def apply(parameters: PathTeamidQueryPage, responses: `200Content101`): Responses200Content101 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content101]
  }
  
  extension [Self <: Responses200Content101](x: Self) {
    
    inline def setParameters(value: PathTeamidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content101`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
