package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422Content55` extends StObject {
  
  /** Response */
  var `200`: Content231
  
  /** Validation error when the environment name is invalid or when `protected_branches` and `custom_branch_policies` in `deployment_branch_policy` are set to the same value */
  var `422`: Content55
}
object `422Content55` {
  
  inline def apply(`200`: Content231, `422`: Content55): `422Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422Content55`]
  }
  
  extension [Self <: `422Content55`](x: Self) {
    
    inline def set200(value: Content231): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content55): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
