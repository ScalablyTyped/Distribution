package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringRunneridNumberResponses extends StObject {
  
  var parameters: PathOrgStringRunneridNumber
}
object ParametersPathOrgStringRunneridNumberResponses {
  
  inline def apply(parameters: PathOrgStringRunneridNumber): ParametersPathOrgStringRunneridNumberResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringRunneridNumberResponses]
  }
  
  extension [Self <: ParametersPathOrgStringRunneridNumberResponses](x: Self) {
    
    inline def setParameters(value: PathOrgStringRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
