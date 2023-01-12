package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409Content48` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBillingemail
  
  var `409`: Content48
  
  /** Validation failed */
  var `422`: Content435
}
object `409Content48` {
  
  inline def apply(`200`: ContentApplicationjsonBillingemail, `409`: Content48, `422`: Content435): `409Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`409Content48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `409Content48`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBillingemail): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content48): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content435): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
