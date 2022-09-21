package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonCardsurl` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonCardsurl
  
  var `304`: Any
  
  var `401`: Content55
  
  var `403`: Content55
  
  var `422`: Content418
}
object `201ContentApplicationjsonCardsurl` {
  
  inline def apply(
    `201`: ContentApplicationjsonCardsurl,
    `304`: Any,
    `401`: Content55,
    `403`: Content55,
    `422`: Content418
  ): `201ContentApplicationjsonCardsurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonCardsurl`]
  }
  
  extension [Self <: `201ContentApplicationjsonCardsurl`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonCardsurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content55): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content418): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
