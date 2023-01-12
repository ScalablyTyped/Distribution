package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content20` extends StObject {
  
  /** Response */
  var `200`: Content20
}
object `200Content20` {
  
  inline def apply(`200`: Content20): `200Content20` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content20`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content20`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content20): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
