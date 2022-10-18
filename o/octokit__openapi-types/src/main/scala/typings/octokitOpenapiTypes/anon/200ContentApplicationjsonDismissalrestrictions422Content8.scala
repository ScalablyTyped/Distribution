package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonDismissalrestrictions422Content8` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDismissalrestrictions
  
  var `422`: Content8
}
object `200ContentApplicationjsonDismissalrestrictions422Content8` {
  
  inline def apply(`200`: ContentApplicationjsonDismissalrestrictions, `422`: Content8): `200ContentApplicationjsonDismissalrestrictions422Content8` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonDismissalrestrictions422Content8`]
  }
  
  extension [Self <: `200ContentApplicationjsonDismissalrestrictions422Content8`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonDismissalrestrictions): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
