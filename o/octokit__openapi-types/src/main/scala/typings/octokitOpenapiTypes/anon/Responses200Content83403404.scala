package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content83403404 extends StObject {
  
  var parameters: PathTeamidQueryPage
  
  var responses: `200Content83403404`
}
object Responses200Content83403404 {
  
  inline def apply(parameters: PathTeamidQueryPage, responses: `200Content83403404`): Responses200Content83403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content83403404]
  }
  
  extension [Self <: Responses200Content83403404](x: Self) {
    
    inline def setParameters(value: PathTeamidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content83403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
