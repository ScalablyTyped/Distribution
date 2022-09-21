package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunneridResponses extends StObject {
  
  var parameters: PathEnterpriseRunnerid
}
object ParametersPathEnterpriseRunneridResponses {
  
  inline def apply(parameters: PathEnterpriseRunnerid): ParametersPathEnterpriseRunneridResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunneridResponses]
  }
  
  extension [Self <: ParametersPathEnterpriseRunneridResponses](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
