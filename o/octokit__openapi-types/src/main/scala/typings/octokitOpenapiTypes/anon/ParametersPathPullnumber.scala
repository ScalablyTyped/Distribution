package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumber extends StObject {
  
  var parameters: PathPullnumber
  
  var responses: `304404500`
}
object ParametersPathPullnumber {
  
  inline def apply(parameters: PathPullnumber, responses: `304404500`): ParametersPathPullnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPullnumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
