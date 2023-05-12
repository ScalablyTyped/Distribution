package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `592` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonOrigin
}
object `592` {
  
  inline def apply(`200`: ContentApplicationjsonOrigin): `592` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`592`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `592`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonOrigin): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
