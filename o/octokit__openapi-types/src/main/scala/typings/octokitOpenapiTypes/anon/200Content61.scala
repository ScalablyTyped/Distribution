package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content61` extends StObject {
  
  /** @description Response */
  var `200`: Content61
}
object `200Content61` {
  
  inline def apply(`200`: Content61): `200Content61` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content61`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content61`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content61): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
