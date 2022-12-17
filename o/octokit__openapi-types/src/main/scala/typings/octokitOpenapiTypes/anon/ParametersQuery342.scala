package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery342 extends StObject {
  
  var parameters: Query342
  
  var responses: `200304422`
}
object ParametersQuery342 {
  
  inline def apply(parameters: Query342, responses: `200304422`): ParametersQuery342 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery342]
  }
  
  extension [Self <: ParametersQuery342](x: Self) {
    
    inline def setParameters(value: Query342): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
