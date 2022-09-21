package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200552` extends StObject {
  
  /** Response */
  var `200`: `552`
  
  var `410`: Content55
  
  var `422`: Content421
}
object `200552` {
  
  inline def apply(`200`: `552`, `410`: Content55, `422`: Content421): `200552` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200552`]
  }
  
  extension [Self <: `200552`](x: Self) {
    
    inline def set200(value: `552`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content55): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
