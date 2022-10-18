package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content32 extends StObject {
  
  var parameters: PathPlanid
  
  var responses: `200Content32`
}
object Responses200Content32 {
  
  inline def apply(parameters: PathPlanid, responses: `200Content32`): Responses200Content32 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content32]
  }
  
  extension [Self <: Responses200Content32](x: Self) {
    
    inline def setParameters(value: PathPlanid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content32`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
