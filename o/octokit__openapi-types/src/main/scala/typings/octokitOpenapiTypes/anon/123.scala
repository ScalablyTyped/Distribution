package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  /** @description Response */
  var `200`: Content56
}
object `123` {
  
  inline def apply(`200`: Content56): `123` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`123`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `123`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content56): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
