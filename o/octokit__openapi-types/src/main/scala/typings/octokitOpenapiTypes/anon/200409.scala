package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200409` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonBillingemail
  
  var `409`: Content36
  
  /** @description Validation failed */
  var `422`: Content499
}
object `200409` {
  
  inline def apply(`200`: ContentApplicationjsonBillingemail, `409`: Content36, `422`: Content499): `200409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200409`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200409`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBillingemail): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content36): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content499): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
