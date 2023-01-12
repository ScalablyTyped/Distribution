package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeUsername extends StObject {
  
  var parameters: PathPackagenamePackagetypeUsername
  
  var responses: `200ContentApplicationjsonVersioncount`
}
object ParametersPathPackagenamePackagetypeUsername {
  
  inline def apply(parameters: PathPackagenamePackagetypeUsername, responses: `200ContentApplicationjsonVersioncount`): ParametersPathPackagenamePackagetypeUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenamePackagetypeUsername] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenamePackagetypeUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonVersioncount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
