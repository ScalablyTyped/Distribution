package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content550` extends StObject {
  
  /** @description Response */
  var `200`: Content550
}
object `200Content550` {
  
  inline def apply(`200`: Content550): `200Content550` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content550`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content550`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content550): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
