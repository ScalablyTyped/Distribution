package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringResponses extends StObject {
  
  var parameters: PathUsernameString
}
object ParametersPathUsernameStringResponses {
  
  inline def apply(parameters: PathUsernameString): ParametersPathUsernameStringResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringResponses]
  }
  
  extension [Self <: ParametersPathUsernameStringResponses](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
