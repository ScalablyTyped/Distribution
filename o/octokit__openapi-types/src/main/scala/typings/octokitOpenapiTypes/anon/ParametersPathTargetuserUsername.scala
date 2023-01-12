package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTargetuserUsername extends StObject {
  
  var parameters: PathTargetuserUsername
  
  var responses: `404Unknown`
}
object ParametersPathTargetuserUsername {
  
  inline def apply(parameters: PathTargetuserUsername, responses: `404Unknown`): ParametersPathTargetuserUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTargetuserUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTargetuserUsername] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTargetuserUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
