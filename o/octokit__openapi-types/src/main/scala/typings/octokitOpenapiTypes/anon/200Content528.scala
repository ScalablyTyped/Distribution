package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content528` extends StObject {
  
  /** @description Response */
  var `200`: Content528
}
object `200Content528` {
  
  inline def apply(`200`: Content528): `200Content528` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content528`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content528`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content528): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
