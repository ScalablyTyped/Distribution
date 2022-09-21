package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409Content55` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBillingemail
  
  var `409`: Content55
  
  /** Validation failed */
  var `422`: Content449
}
object `409Content55` {
  
  inline def apply(`200`: ContentApplicationjsonBillingemail, `409`: Content55, `422`: Content449): `409Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`409Content55`]
  }
  
  extension [Self <: `409Content55`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBillingemail): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content55): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content449): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
