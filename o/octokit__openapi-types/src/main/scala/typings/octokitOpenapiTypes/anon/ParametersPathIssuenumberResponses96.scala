package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberResponses96 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `96`
}
object ParametersPathIssuenumberResponses96 {
  
  inline def apply(parameters: PathIssuenumber, responses: `96`): ParametersPathIssuenumberResponses96 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberResponses96]
  }
  
  extension [Self <: ParametersPathIssuenumberResponses96](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `96`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
