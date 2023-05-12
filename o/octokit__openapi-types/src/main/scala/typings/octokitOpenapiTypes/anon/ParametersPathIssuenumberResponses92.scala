package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberResponses92 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `92`
}
object ParametersPathIssuenumberResponses92 {
  
  inline def apply(parameters: PathIssuenumber, responses: `92`): ParametersPathIssuenumberResponses92 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberResponses92]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberResponses92] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `92`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
