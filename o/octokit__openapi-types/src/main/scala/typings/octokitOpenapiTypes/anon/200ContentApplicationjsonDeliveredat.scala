package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonDeliveredat` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDeliveredat
  
  var `400`: Content420
  
  var `422`: Content421
}
object `200ContentApplicationjsonDeliveredat` {
  
  inline def apply(`200`: ContentApplicationjsonDeliveredat, `400`: Content420, `422`: Content421): `200ContentApplicationjsonDeliveredat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonDeliveredat`]
  }
  
  extension [Self <: `200ContentApplicationjsonDeliveredat`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonDeliveredat): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: Content420): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
