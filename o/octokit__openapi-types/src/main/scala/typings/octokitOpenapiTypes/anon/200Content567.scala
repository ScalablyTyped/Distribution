package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content567` extends StObject {
  
  /** Response */
  var `200`: Content567
  
  var `403`: Content48
}
object `200Content567` {
  
  inline def apply(`200`: Content567, `403`: Content48): `200Content567` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content567`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content567`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content567): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
