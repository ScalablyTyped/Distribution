package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content523304Unknown` extends StObject {
  
  /** Response */
  var `200`: Content523
  
  var `304`: Any
  
  var `422`: Content421
}
object `200Content523304Unknown` {
  
  inline def apply(`200`: Content523, `304`: Any, `422`: Content421): `200Content523304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content523304Unknown`]
  }
  
  extension [Self <: `200Content523304Unknown`](x: Self) {
    
    inline def set200(value: Content523): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
