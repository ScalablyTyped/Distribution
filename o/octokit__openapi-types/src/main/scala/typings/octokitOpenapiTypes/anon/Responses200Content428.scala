package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content428 extends StObject {
  
  var parameters: PathPlanidNumber
  
  var responses: `200Content428`
}
object Responses200Content428 {
  
  inline def apply(parameters: PathPlanidNumber, responses: `200Content428`): Responses200Content428 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content428]
  }
  
  extension [Self <: Responses200Content428](x: Self) {
    
    inline def setParameters(value: PathPlanidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content428`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
