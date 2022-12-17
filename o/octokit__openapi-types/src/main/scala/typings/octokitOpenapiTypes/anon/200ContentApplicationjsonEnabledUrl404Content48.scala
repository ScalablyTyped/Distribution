package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonEnabledUrl404Content48` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonEnabledUrl
  
  var `404`: Content48
}
object `200ContentApplicationjsonEnabledUrl404Content48` {
  
  inline def apply(`200`: ContentApplicationjsonEnabledUrl, `404`: Content48): `200ContentApplicationjsonEnabledUrl404Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonEnabledUrl404Content48`]
  }
  
  extension [Self <: `200ContentApplicationjsonEnabledUrl404Content48`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonEnabledUrl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
