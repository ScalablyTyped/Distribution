package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypeUsername extends StObject {
  
  var parameters: PathPackagetypeUsername
  
  var responses: `200Content96`
}
object ParametersPathPackagetypeUsername {
  
  inline def apply(parameters: PathPackagetypeUsername, responses: `200Content96`): ParametersPathPackagetypeUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypeUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagetypeUsername] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagetypeUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content96`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
