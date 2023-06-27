package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `710` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonOrigin
}
object `710` {
  
  inline def apply(`200`: ContentApplicationjsonOrigin): `710` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`710`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `710`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonOrigin): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
