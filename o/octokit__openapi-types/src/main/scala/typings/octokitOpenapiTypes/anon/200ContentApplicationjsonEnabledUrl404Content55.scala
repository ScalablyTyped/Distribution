package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonEnabledUrl404Content55` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonEnabledUrl
  
  var `404`: Content55
}
object `200ContentApplicationjsonEnabledUrl404Content55` {
  
  inline def apply(`200`: ContentApplicationjsonEnabledUrl, `404`: Content55): `200ContentApplicationjsonEnabledUrl404Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonEnabledUrl404Content55`]
  }
  
  extension [Self <: `200ContentApplicationjsonEnabledUrl404Content55`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonEnabledUrl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
