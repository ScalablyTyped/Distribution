package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content440Headers304Unknown` extends StObject {
  
  /** Response */
  var `200`: Content440Headers
  
  var `304`: Any
  
  var `401`: Content48
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `422`: Content397
}
object `200Content440Headers304Unknown` {
  
  inline def apply(
    `200`: Content440Headers,
    `304`: Any,
    `401`: Content48,
    `403`: Content48,
    `404`: Content48,
    `422`: Content397
  ): `200Content440Headers304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content440Headers304Unknown`]
  }
  
  extension [Self <: `200Content440Headers304Unknown`](x: Self) {
    
    inline def set200(value: Content440Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
