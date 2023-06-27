package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content820` extends StObject {
  
  /** @description Response */
  var `200`: Content820
}
object `200Content820` {
  
  inline def apply(`200`: Content820): `200Content820` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content820`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content820`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content820): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
