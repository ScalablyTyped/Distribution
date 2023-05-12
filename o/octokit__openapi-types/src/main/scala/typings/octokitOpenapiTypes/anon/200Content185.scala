package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content185` extends StObject {
  
  /** @description Response */
  var `200`: Content185
}
object `200Content185` {
  
  inline def apply(`200`: Content185): `200Content185` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content185`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content185`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content185): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
