package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDirOwner extends StObject {
  
  var parameters: PathDirOwner
  
  var responses: `200ContentApplicationjsonSubmodulegiturl`
}
object ParametersPathDirOwner {
  
  inline def apply(parameters: PathDirOwner, responses: `200ContentApplicationjsonSubmodulegiturl`): ParametersPathDirOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDirOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDirOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDirOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSubmodulegiturl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
