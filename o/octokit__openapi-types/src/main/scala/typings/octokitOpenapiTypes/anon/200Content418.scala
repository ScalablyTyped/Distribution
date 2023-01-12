package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content418` extends StObject {
  
  /** Response */
  var `200`: Content418
  
  var `304`: Any
  
  var `403`: Content48
}
object `200Content418` {
  
  inline def apply(`200`: Content418, `304`: Any, `403`: Content48): `200Content418` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content418`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content418`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content418): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
