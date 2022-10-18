package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery432 extends StObject {
  
  var parameters: Query432
  
  var responses: `200Content433`
}
object ParametersQuery432 {
  
  inline def apply(parameters: Query432, responses: `200Content433`): ParametersQuery432 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery432]
  }
  
  extension [Self <: ParametersQuery432](x: Self) {
    
    inline def setParameters(value: Query432): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content433`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
