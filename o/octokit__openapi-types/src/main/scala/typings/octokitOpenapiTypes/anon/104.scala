package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  /** @description Response */
  var `200`: Content48
}
object `104` {
  
  inline def apply(`200`: Content48): `104` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`104`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `104`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content48): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
