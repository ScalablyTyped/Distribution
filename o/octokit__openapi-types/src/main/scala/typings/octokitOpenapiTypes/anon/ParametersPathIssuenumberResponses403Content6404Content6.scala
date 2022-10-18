package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberResponses403Content6404Content6 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `403Content6404Content6`
}
object ParametersPathIssuenumberResponses403Content6404Content6 {
  
  inline def apply(parameters: PathIssuenumber, responses: `403Content6404Content6`): ParametersPathIssuenumberResponses403Content6404Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberResponses403Content6404Content6]
  }
  
  extension [Self <: ParametersPathIssuenumberResponses403Content6404Content6](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content6404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
