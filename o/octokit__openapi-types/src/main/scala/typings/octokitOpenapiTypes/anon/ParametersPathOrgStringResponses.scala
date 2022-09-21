package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses extends StObject {
  
  var parameters: PathOrgString
}
object ParametersPathOrgStringResponses {
  
  inline def apply(parameters: PathOrgString): ParametersPathOrgStringResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses]
  }
  
  extension [Self <: ParametersPathOrgStringResponses](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
