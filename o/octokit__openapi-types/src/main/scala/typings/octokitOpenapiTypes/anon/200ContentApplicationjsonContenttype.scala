package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonContenttype` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonContenttype
}
object `200ContentApplicationjsonContenttype` {
  
  inline def apply(`200`: ContentApplicationjsonContenttype): `200ContentApplicationjsonContenttype` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonContenttype`]
  }
  
  extension [Self <: `200ContentApplicationjsonContenttype`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonContenttype): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
