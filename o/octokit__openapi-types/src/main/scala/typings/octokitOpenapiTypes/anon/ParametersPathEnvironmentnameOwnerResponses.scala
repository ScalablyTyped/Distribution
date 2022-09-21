package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwnerResponses extends StObject {
  
  var parameters: PathEnvironmentnameOwner
}
object ParametersPathEnvironmentnameOwnerResponses {
  
  inline def apply(parameters: PathEnvironmentnameOwner): ParametersPathEnvironmentnameOwnerResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwnerResponses]
  }
  
  extension [Self <: ParametersPathEnvironmentnameOwnerResponses](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
