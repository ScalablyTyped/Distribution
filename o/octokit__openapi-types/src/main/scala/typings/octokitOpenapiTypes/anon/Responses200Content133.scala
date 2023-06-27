package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content133 extends StObject {
  
  var parameters: PathTeamslug
  
  var responses: `200Content133`
}
object Responses200Content133 {
  
  inline def apply(parameters: PathTeamslug, responses: `200Content133`): Responses200Content133 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content133]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content133] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content133`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
