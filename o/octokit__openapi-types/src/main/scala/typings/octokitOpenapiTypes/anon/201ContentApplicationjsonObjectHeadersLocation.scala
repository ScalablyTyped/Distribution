package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonObjectHeadersLocation` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonObjectHeadersLocation
  
  var `422`: Content8
}
object `201ContentApplicationjsonObjectHeadersLocation` {
  
  inline def apply(`201`: ContentApplicationjsonObjectHeadersLocation, `422`: Content8): `201ContentApplicationjsonObjectHeadersLocation` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonObjectHeadersLocation`]
  }
  
  extension [Self <: `201ContentApplicationjsonObjectHeadersLocation`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonObjectHeadersLocation): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
