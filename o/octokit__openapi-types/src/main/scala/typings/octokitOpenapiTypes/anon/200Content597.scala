package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content597` extends StObject {
  
  /** @description Response */
  var `200`: Content597
  
  var `410`: Content36
}
object `200Content597` {
  
  inline def apply(`200`: Content597, `410`: Content36): `200Content597` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content597`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content597`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content597): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content36): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
