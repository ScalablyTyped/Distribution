package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  /** @description Response */
  var `200`: Content79
}
object `121` {
  
  inline def apply(`200`: Content79): `121` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `121`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content79): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
