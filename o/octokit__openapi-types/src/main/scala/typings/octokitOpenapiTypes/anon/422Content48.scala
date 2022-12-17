package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422Content48` extends StObject {
  
  /** Response */
  var `200`: Content224
  
  /** Validation error when the environment name is invalid or when `protected_branches` and `custom_branch_policies` in `deployment_branch_policy` are set to the same value */
  var `422`: Content48
}
object `422Content48` {
  
  inline def apply(`200`: Content224, `422`: Content48): `422Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422Content48`]
  }
  
  extension [Self <: `422Content48`](x: Self) {
    
    inline def set200(value: Content224): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content48): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
