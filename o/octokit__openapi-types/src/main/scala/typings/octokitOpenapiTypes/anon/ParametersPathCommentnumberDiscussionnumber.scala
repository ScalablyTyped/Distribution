package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumber extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumber
  
  var responses: `200Content137`
}
object ParametersPathCommentnumberDiscussionnumber {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumber, responses: `200Content137`): ParametersPathCommentnumberDiscussionnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentnumberDiscussionnumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content137`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
