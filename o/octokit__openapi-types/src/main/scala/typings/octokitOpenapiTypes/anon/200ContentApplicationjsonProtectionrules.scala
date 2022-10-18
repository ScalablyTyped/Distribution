package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonProtectionrules` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonProtectionrules
}
object `200ContentApplicationjsonProtectionrules` {
  
  inline def apply(`200`: ContentApplicationjsonProtectionrules): `200ContentApplicationjsonProtectionrules` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonProtectionrules`]
  }
  
  extension [Self <: `200ContentApplicationjsonProtectionrules`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonProtectionrules): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
