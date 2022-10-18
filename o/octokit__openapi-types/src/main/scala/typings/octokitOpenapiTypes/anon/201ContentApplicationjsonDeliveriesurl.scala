package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonDeliveriesurl` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonDeliveriesurl
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `422`: Content8
}
object `201ContentApplicationjsonDeliveriesurl` {
  
  inline def apply(`201`: ContentApplicationjsonDeliveriesurl, `403`: Content6, `404`: Content6, `422`: Content8): `201ContentApplicationjsonDeliveriesurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonDeliveriesurl`]
  }
  
  extension [Self <: `201ContentApplicationjsonDeliveriesurl`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonDeliveriesurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
