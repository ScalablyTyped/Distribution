package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content445 extends StObject {
  
  var parameters: PathPlanidNumber
  
  var responses: `200Content445`
}
object Responses200Content445 {
  
  inline def apply(parameters: PathPlanidNumber, responses: `200Content445`): Responses200Content445 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content445]
  }
  
  extension [Self <: Responses200Content445](x: Self) {
    
    inline def setParameters(value: PathPlanidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content445`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
