package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content468 extends StObject {
  
  var parameters: PathTeamslugStringQuery407
  
  var responses: `200Content468`
}
object Responses200Content468 {
  
  inline def apply(parameters: PathTeamslugStringQuery407, responses: `200Content468`): Responses200Content468 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content468]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content468] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugStringQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content468`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
