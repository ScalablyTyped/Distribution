package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `654` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonBillable
}
object `654` {
  
  inline def apply(`200`: ContentApplicationjsonBillable): `654` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`654`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `654`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBillable): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
