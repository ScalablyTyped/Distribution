package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseOrgid extends StObject {
  
  var parameters: PathEnterpriseOrgid
}
object ParametersPathEnterpriseOrgid {
  
  inline def apply(parameters: PathEnterpriseOrgid): ParametersPathEnterpriseOrgid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseOrgid]
  }
  
  extension [Self <: ParametersPathEnterpriseOrgid](x: Self) {
    
    inline def setParameters(value: PathEnterpriseOrgid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
