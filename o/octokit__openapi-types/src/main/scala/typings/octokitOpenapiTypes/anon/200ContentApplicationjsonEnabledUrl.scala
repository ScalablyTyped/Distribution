package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonEnabledUrl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonEnabledUrl
}
object `200ContentApplicationjsonEnabledUrl` {
  
  inline def apply(`200`: ContentApplicationjsonEnabledUrl): `200ContentApplicationjsonEnabledUrl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonEnabledUrl`]
  }
  
  extension [Self <: `200ContentApplicationjsonEnabledUrl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonEnabledUrl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
