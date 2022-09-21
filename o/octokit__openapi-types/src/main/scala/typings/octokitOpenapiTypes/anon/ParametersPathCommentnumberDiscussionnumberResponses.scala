package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberResponses extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumber
}
object ParametersPathCommentnumberDiscussionnumberResponses {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumber): ParametersPathCommentnumberDiscussionnumberResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberResponses]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberResponses](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
