package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content489401Content36` extends StObject {
  
  /** @description Response */
  var `200`: Content489
  
  var `401`: Content36
}
object `200Content489401Content36` {
  
  inline def apply(`200`: Content489, `401`: Content36): `200Content489401Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content489401Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content489401Content36`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content489): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content36): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
  }
}
