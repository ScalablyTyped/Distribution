package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content536 extends StObject {
  
  var parameters: PathTeamslugStringQuery473
  
  var responses: `200Content536`
}
object Responses200Content536 {
  
  inline def apply(parameters: PathTeamslugStringQuery473, responses: `200Content536`): Responses200Content536 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content536]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content536] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content536`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
