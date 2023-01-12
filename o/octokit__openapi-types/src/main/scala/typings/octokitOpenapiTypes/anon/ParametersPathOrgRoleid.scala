package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRoleid extends StObject {
  
  var parameters: PathOrgRoleid
}
object ParametersPathOrgRoleid {
  
  inline def apply(parameters: PathOrgRoleid): ParametersPathOrgRoleid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRoleid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRoleid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRoleid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
