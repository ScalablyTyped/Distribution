package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumber extends StObject {
  
  var parameters: PathDiscussionnumber
  
  var responses: `200Content135`
}
object ParametersPathDiscussionnumber {
  
  inline def apply(parameters: PathDiscussionnumber, responses: `200Content135`): ParametersPathDiscussionnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content135`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
