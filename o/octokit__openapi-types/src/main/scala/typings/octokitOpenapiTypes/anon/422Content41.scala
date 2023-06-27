package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422Content41` extends StObject {
  
  /** @description Response */
  var `200`: Content281
  
  /** @description Validation error when the environment name is invalid or when `protected_branches` and `custom_branch_policies` in `deployment_branch_policy` are set to the same value */
  var `422`: Content41
}
object `422Content41` {
  
  inline def apply(`200`: Content281, `422`: Content41): `422Content41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422Content41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `422Content41`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content281): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content41): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
