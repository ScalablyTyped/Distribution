package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonItemsArrayTotalcountNumber` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonItemsArrayTotalcountNumber
  
  var `304`: Any
}
object `200ContentApplicationjsonItemsArrayTotalcountNumber` {
  
  inline def apply(`200`: ContentApplicationjsonItemsArrayTotalcountNumber, `304`: Any): `200ContentApplicationjsonItemsArrayTotalcountNumber` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonItemsArrayTotalcountNumber`]
  }
  
  extension [Self <: `200ContentApplicationjsonItemsArrayTotalcountNumber`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonItemsArrayTotalcountNumber): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
