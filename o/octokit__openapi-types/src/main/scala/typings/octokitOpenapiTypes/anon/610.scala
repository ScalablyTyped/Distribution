package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `610` extends StObject {
  
  /** @description Response */
  var `200`: Content598
}
object `610` {
  
  inline def apply(`200`: Content598): `610` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`610`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `610`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content598): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
