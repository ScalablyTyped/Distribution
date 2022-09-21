package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery468 extends StObject {
  
  var parameters: Query468
  
  var responses: `469`
}
object ParametersQuery468 {
  
  inline def apply(parameters: Query468, responses: `469`): ParametersQuery468 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery468]
  }
  
  extension [Self <: ParametersQuery468](x: Self) {
    
    inline def setParameters(value: Query468): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `469`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
