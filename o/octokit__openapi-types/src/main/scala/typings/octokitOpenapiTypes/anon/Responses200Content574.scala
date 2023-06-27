package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content574 extends StObject {
  
  var parameters: PathPlanidNumber
  
  var responses: `200Content574`
}
object Responses200Content574 {
  
  inline def apply(parameters: PathPlanidNumber, responses: `200Content574`): Responses200Content574 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content574]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content574] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPlanidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content574`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
