package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonFingerprint422Content421` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonFingerprint
  
  var `422`: Content421
}
object `200ContentApplicationjsonFingerprint422Content421` {
  
  inline def apply(`200`: ContentApplicationjsonFingerprint, `422`: Content421): `200ContentApplicationjsonFingerprint422Content421` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonFingerprint422Content421`]
  }
  
  extension [Self <: `200ContentApplicationjsonFingerprint422Content421`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonFingerprint): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
