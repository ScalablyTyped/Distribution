package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberResponses106 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `106`
}
object ParametersPathIssuenumberResponses106 {
  
  inline def apply(parameters: PathIssuenumber, responses: `106`): ParametersPathIssuenumberResponses106 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberResponses106]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberResponses106] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `106`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
