package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `267` extends StObject {
  
  /** @description Response */
  var `200`: Content85
}
object `267` {
  
  inline def apply(`200`: Content85): `267` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`267`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `267`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content85): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
