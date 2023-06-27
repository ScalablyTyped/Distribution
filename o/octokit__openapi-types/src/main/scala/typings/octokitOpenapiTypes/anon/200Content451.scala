package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content451` extends StObject {
  
  /** @description Response */
  var `200`: Content451
}
object `200Content451` {
  
  inline def apply(`200`: Content451): `200Content451` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content451`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content451`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content451): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
