package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAllBefore extends StObject {
  
  var parameters: QueryAllBefore
  
  var responses: `200Content429`
}
object ParametersQueryAllBefore {
  
  inline def apply(parameters: QueryAllBefore, responses: `200Content429`): ParametersQueryAllBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAllBefore]
  }
  
  extension [Self <: ParametersQueryAllBefore](x: Self) {
    
    inline def setParameters(value: QueryAllBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content429`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
