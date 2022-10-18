package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonSecret` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonSecret
}
object `200ContentApplicationjsonSecret` {
  
  inline def apply(`200`: ContentApplicationjsonSecret): `200ContentApplicationjsonSecret` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonSecret`]
  }
  
  extension [Self <: `200ContentApplicationjsonSecret`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonSecret): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
