package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBillable` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonBillable
  
  var `404`: Content36
}
object `200ContentApplicationjsonBillable` {
  
  inline def apply(`200`: ContentApplicationjsonBillable, `404`: Content36): `200ContentApplicationjsonBillable` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBillable`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonBillable`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBillable): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
