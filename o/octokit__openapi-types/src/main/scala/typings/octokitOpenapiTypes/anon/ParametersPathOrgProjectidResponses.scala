package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgProjectidResponses extends StObject {
  
  var parameters: PathOrgProjectid
}
object ParametersPathOrgProjectidResponses {
  
  inline def apply(parameters: PathOrgProjectid): ParametersPathOrgProjectidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgProjectidResponses]
  }
  
  extension [Self <: ParametersPathOrgProjectidResponses](x: Self) {
    
    inline def setParameters(value: PathOrgProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
