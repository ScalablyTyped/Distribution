package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content454` extends StObject {
  
  /** Response */
  var `200`: Content454
  
  var `401`: Content48
  
  var `403`: Content48
}
object `200Content454` {
  
  inline def apply(`200`: Content454, `401`: Content48, `403`: Content48): `200Content454` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content454`]
  }
  
  extension [Self <: `200Content454`](x: Self) {
    
    inline def set200(value: Content454): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
