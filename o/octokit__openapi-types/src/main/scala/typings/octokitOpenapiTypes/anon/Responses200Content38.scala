package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content38 extends StObject {
  
  var parameters: PathPlanid
  
  var responses: `200Content38`
}
object Responses200Content38 {
  
  inline def apply(parameters: PathPlanid, responses: `200Content38`): Responses200Content38 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content38]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content38] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPlanid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content38`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
