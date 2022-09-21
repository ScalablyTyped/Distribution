package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameResponses extends StObject {
  
  var parameters: PathOrgSecretname
}
object ParametersPathOrgSecretnameResponses {
  
  inline def apply(parameters: PathOrgSecretname): ParametersPathOrgSecretnameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameResponses]
  }
  
  extension [Self <: ParametersPathOrgSecretnameResponses](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
