package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content497 extends StObject {
  
  var parameters: PathTeamidNumberQuery473
  
  var responses: `200Content497`
}
object Responses200Content497 {
  
  inline def apply(parameters: PathTeamidNumberQuery473, responses: `200Content497`): Responses200Content497 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content497]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content497] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content497`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
