package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberResponses extends StObject {
  
  var parameters: PathPullnumber
}
object ParametersPathPullnumberResponses {
  
  inline def apply(parameters: PathPullnumber): ParametersPathPullnumberResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPullnumberResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
