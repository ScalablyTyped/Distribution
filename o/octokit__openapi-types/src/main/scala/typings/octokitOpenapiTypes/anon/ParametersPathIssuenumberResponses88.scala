package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberResponses88 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `88`
}
object ParametersPathIssuenumberResponses88 {
  
  inline def apply(parameters: PathIssuenumber, responses: `88`): ParametersPathIssuenumberResponses88 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberResponses88]
  }
  
  extension [Self <: ParametersPathIssuenumberResponses88](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `88`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
