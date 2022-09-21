package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgOwnerResponses extends StObject {
  
  var parameters: PathOrgOwner
}
object ParametersPathOrgOwnerResponses {
  
  inline def apply(parameters: PathOrgOwner): ParametersPathOrgOwnerResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgOwnerResponses]
  }
  
  extension [Self <: ParametersPathOrgOwnerResponses](x: Self) {
    
    inline def setParameters(value: PathOrgOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
