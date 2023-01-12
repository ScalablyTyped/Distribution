package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberResponses404Unknown extends StObject {
  
  var parameters: PathPullnumber
  
  var responses: `404Unknown`
}
object ParametersPathPullnumberResponses404Unknown {
  
  inline def apply(parameters: PathPullnumber, responses: `404Unknown`): ParametersPathPullnumberResponses404Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberResponses404Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPullnumberResponses404Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
