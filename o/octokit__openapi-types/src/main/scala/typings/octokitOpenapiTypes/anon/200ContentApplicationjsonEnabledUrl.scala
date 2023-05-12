package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonEnabledUrl` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonEnabledUrl
}
object `200ContentApplicationjsonEnabledUrl` {
  
  inline def apply(`200`: ContentApplicationjsonEnabledUrl): `200ContentApplicationjsonEnabledUrl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonEnabledUrl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonEnabledUrl`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonEnabledUrl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
