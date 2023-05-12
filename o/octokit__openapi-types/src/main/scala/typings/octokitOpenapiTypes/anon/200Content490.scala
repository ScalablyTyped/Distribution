package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content490` extends StObject {
  
  /** @description Response */
  var `200`: Content490
  
  var `401`: Content36
}
object `200Content490` {
  
  inline def apply(`200`: Content490, `401`: Content36): `200Content490` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content490`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content490`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content490): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content36): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
  }
}
