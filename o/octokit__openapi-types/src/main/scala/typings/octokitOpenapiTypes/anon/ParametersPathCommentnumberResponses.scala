package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberResponses extends StObject {
  
  var parameters: PathCommentnumber
}
object ParametersPathCommentnumberResponses {
  
  inline def apply(parameters: PathCommentnumber): ParametersPathCommentnumberResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberResponses]
  }
  
  extension [Self <: ParametersPathCommentnumberResponses](x: Self) {
    
    inline def setParameters(value: PathCommentnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
