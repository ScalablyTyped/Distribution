package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content124 extends StObject {
  
  var parameters: PathTeamslugQueryPage
  
  var responses: `200Content124`
}
object Responses200Content124 {
  
  inline def apply(parameters: PathTeamslugQueryPage, responses: `200Content124`): Responses200Content124 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content124]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content124] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content124`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
