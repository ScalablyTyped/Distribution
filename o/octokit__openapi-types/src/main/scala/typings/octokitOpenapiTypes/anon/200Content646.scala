package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content646` extends StObject {
  
  /** @description Response */
  var `200`: Content646
}
object `200Content646` {
  
  inline def apply(`200`: Content646): `200Content646` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content646`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content646`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content646): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
