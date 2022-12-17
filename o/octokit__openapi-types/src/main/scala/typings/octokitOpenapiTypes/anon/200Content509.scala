package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content509` extends StObject {
  
  /** Response */
  var `200`: Content509
  
  var `403`: Content48
  
  var `404`: Content48
}
object `200Content509` {
  
  inline def apply(`200`: Content509, `403`: Content48, `404`: Content48): `200Content509` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content509`]
  }
  
  extension [Self <: `200Content509`](x: Self) {
    
    inline def set200(value: Content509): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
