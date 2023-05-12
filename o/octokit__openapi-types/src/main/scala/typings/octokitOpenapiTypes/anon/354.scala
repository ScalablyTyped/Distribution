package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `354` extends StObject {
  
  /** @description Response */
  var `200`: Content353
}
object `354` {
  
  inline def apply(`200`: Content353): `354` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`354`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `354`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content353): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
