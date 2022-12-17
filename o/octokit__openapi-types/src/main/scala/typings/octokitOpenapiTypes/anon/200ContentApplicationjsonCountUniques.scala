package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCountUniques` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCountUniques
  
  var `403`: Content48
}
object `200ContentApplicationjsonCountUniques` {
  
  inline def apply(`200`: ContentApplicationjsonCountUniques, `403`: Content48): `200ContentApplicationjsonCountUniques` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCountUniques`]
  }
  
  extension [Self <: `200ContentApplicationjsonCountUniques`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCountUniques): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
