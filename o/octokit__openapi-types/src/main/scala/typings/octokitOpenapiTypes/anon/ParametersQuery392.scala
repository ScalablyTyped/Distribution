package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery392 extends StObject {
  
  var parameters: Query392
  
  var responses: `200Content73HeadersLink`
}
object ParametersQuery392 {
  
  inline def apply(parameters: Query392, responses: `200Content73HeadersLink`): ParametersQuery392 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery392]
  }
  
  extension [Self <: ParametersQuery392](x: Self) {
    
    inline def setParameters(value: Query392): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content73HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
