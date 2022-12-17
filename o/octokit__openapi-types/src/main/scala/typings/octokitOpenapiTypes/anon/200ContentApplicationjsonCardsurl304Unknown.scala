package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCardsurl304Unknown` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCardsurl
  
  var `304`: Any
  
  var `401`: Content48
  
  var `403`: Content48
}
object `200ContentApplicationjsonCardsurl304Unknown` {
  
  inline def apply(`200`: ContentApplicationjsonCardsurl, `304`: Any, `401`: Content48, `403`: Content48): `200ContentApplicationjsonCardsurl304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCardsurl304Unknown`]
  }
  
  extension [Self <: `200ContentApplicationjsonCardsurl304Unknown`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCardsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
