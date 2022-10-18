package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200404` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonFingerprint
  
  var `404`: Content6
  
  var `422`: Content8
}
object `200404` {
  
  inline def apply(`200`: ContentApplicationjsonFingerprint, `404`: Content6, `422`: Content8): `200404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200404`]
  }
  
  extension [Self <: `200404`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonFingerprint): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
