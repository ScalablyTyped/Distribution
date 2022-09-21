package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonNodeidUser` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonNodeidUser
  
  /** Response */
  var `201`: ContentApplicationjsonNodeidUser
}
object `200ContentApplicationjsonNodeidUser` {
  
  inline def apply(`200`: ContentApplicationjsonNodeidUser, `201`: ContentApplicationjsonNodeidUser): `200ContentApplicationjsonNodeidUser` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonNodeidUser`]
  }
  
  extension [Self <: `200ContentApplicationjsonNodeidUser`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonNodeidUser): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: ContentApplicationjsonNodeidUser): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
