package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content113 extends StObject {
  
  var parameters: PathTeamslug
  
  var responses: `200Content113`
}
object Responses200Content113 {
  
  inline def apply(parameters: PathTeamslug, responses: `200Content113`): Responses200Content113 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content113]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content113] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
