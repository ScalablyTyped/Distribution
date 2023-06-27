package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content198` extends StObject {
  
  /** @description Response */
  var `200`: Content198
}
object `200Content198` {
  
  inline def apply(`200`: Content198): `200Content198` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content198`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content198`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content198): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
