package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery457 extends StObject {
  
  var parameters: Query457
  
  var responses: `200Content458`
}
object ParametersQuery457 {
  
  inline def apply(parameters: Query457, responses: `200Content458`): ParametersQuery457 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery457]
  }
  
  extension [Self <: ParametersQuery457](x: Self) {
    
    inline def setParameters(value: Query457): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content458`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
