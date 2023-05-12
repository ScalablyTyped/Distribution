package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery68 extends StObject {
  
  var parameters: Query68
  
  var responses: `200ContentApplicationjsonVariables`
}
object ParametersQuery68 {
  
  inline def apply(parameters: Query68, responses: `200ContentApplicationjsonVariables`): ParametersQuery68 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery68]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery68] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query68): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonVariables`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
