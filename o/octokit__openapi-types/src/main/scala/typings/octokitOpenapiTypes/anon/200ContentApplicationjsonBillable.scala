package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBillable` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBillable
}
object `200ContentApplicationjsonBillable` {
  
  inline def apply(`200`: ContentApplicationjsonBillable): `200ContentApplicationjsonBillable` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBillable`]
  }
  
  extension [Self <: `200ContentApplicationjsonBillable`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBillable): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
