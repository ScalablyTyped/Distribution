package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `552` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonBillable
}
object `552` {
  
  inline def apply(`200`: ContentApplicationjsonBillable): `552` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`552`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `552`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBillable): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
