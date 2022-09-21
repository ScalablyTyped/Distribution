package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content454Headers304Unknown401Content55` extends StObject {
  
  /** Response */
  var `200`: Content454Headers
  
  var `304`: Any
  
  var `401`: Content55
  
  var `403`: Content55
}
object `200Content454Headers304Unknown401Content55` {
  
  inline def apply(`200`: Content454Headers, `304`: Any, `401`: Content55, `403`: Content55): `200Content454Headers304Unknown401Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content454Headers304Unknown401Content55`]
  }
  
  extension [Self <: `200Content454Headers304Unknown401Content55`](x: Self) {
    
    inline def set200(value: Content454Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content55): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
