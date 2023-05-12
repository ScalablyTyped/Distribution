package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerProtectionruleid extends StObject {
  
  var parameters: PathOwnerProtectionruleid
}
object ParametersPathOwnerProtectionruleid {
  
  inline def apply(parameters: PathOwnerProtectionruleid): ParametersPathOwnerProtectionruleid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerProtectionruleid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerProtectionruleid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerProtectionruleid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
