package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422ContentApplicationjson` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonProtectionrules
  
  /** Validation error when the environment name is invalid or when `protected_branches` and `custom_branch_policies` in `deployment_branch_policy` are set to the same value */
  var `422`: ContentApplicationjson
}
object `422ContentApplicationjson` {
  
  inline def apply(`200`: ContentApplicationjsonProtectionrules, `422`: ContentApplicationjson): `422ContentApplicationjson` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422ContentApplicationjson`]
  }
  
  extension [Self <: `422ContentApplicationjson`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonProtectionrules): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: ContentApplicationjson): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
