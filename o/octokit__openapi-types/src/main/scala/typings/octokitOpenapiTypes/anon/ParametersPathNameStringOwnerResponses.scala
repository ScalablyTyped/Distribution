package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOwnerResponses extends StObject {
  
  var parameters: PathNameStringOwner
}
object ParametersPathNameStringOwnerResponses {
  
  inline def apply(parameters: PathNameStringOwner): ParametersPathNameStringOwnerResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOwnerResponses]
  }
  
  extension [Self <: ParametersPathNameStringOwnerResponses](x: Self) {
    
    inline def setParameters(value: PathNameStringOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
