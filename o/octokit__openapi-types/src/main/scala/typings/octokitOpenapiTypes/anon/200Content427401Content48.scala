package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content427401Content48` extends StObject {
  
  /** Response */
  var `200`: Content427
  
  var `401`: Content48
}
object `200Content427401Content48` {
  
  inline def apply(`200`: Content427, `401`: Content48): `200Content427401Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content427401Content48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content427401Content48`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content427): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
  }
}
