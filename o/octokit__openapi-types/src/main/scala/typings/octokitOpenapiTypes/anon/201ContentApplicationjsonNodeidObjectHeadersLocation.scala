package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonNodeidObjectHeadersLocation` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonNodeidObjectHeadersLocation
  
  var `422`: Content397
}
object `201ContentApplicationjsonNodeidObjectHeadersLocation` {
  
  inline def apply(`201`: ContentApplicationjsonNodeidObjectHeadersLocation, `422`: Content397): `201ContentApplicationjsonNodeidObjectHeadersLocation` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonNodeidObjectHeadersLocation`]
  }
  
  extension [Self <: `201ContentApplicationjsonNodeidObjectHeadersLocation`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonNodeidObjectHeadersLocation): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
