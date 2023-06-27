package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonDeliveriesurl` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonDeliveriesurl
  
  var `404`: Content41
  
  var `422`: Content414
}
object `201ContentApplicationjsonDeliveriesurl` {
  
  inline def apply(`201`: ContentApplicationjsonDeliveriesurl, `404`: Content41, `422`: Content414): `201ContentApplicationjsonDeliveriesurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonDeliveriesurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonDeliveriesurl`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonDeliveriesurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
