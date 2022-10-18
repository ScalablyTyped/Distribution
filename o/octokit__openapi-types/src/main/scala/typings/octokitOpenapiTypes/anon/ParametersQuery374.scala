package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery374 extends StObject {
  
  var parameters: Query374
  
  var responses: `200Content375`
}
object ParametersQuery374 {
  
  inline def apply(parameters: Query374, responses: `200Content375`): ParametersQuery374 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery374]
  }
  
  extension [Self <: ParametersQuery374](x: Self) {
    
    inline def setParameters(value: Query374): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content375`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
