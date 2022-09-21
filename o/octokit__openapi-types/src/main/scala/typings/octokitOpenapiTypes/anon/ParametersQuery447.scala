package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery447 extends StObject {
  
  var parameters: Query447
  
  var responses: `200Content448`
}
object ParametersQuery447 {
  
  inline def apply(parameters: Query447, responses: `200Content448`): ParametersQuery447 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery447]
  }
  
  extension [Self <: ParametersQuery447](x: Self) {
    
    inline def setParameters(value: Query447): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content448`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
