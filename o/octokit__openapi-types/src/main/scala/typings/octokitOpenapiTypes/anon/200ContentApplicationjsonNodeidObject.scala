package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonNodeidObject` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonNodeidObject
  
  var `404`: Content48
}
object `200ContentApplicationjsonNodeidObject` {
  
  inline def apply(`200`: ContentApplicationjsonNodeidObject, `404`: Content48): `200ContentApplicationjsonNodeidObject` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonNodeidObject`]
  }
  
  extension [Self <: `200ContentApplicationjsonNodeidObject`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonNodeidObject): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
