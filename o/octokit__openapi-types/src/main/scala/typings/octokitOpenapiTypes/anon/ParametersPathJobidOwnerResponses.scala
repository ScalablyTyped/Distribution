package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathJobidOwnerResponses extends StObject {
  
  var parameters: PathJobidOwner
}
object ParametersPathJobidOwnerResponses {
  
  inline def apply(parameters: PathJobidOwner): ParametersPathJobidOwnerResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathJobidOwnerResponses]
  }
  
  extension [Self <: ParametersPathJobidOwnerResponses](x: Self) {
    
    inline def setParameters(value: PathJobidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
