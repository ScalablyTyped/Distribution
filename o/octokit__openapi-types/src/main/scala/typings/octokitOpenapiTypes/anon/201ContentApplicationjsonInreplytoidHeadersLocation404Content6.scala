package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonInreplytoidHeadersLocation404Content6` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonInreplytoidHeadersLocation
  
  var `404`: Content6
}
object `201ContentApplicationjsonInreplytoidHeadersLocation404Content6` {
  
  inline def apply(`201`: ContentApplicationjsonInreplytoidHeadersLocation, `404`: Content6): `201ContentApplicationjsonInreplytoidHeadersLocation404Content6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonInreplytoidHeadersLocation404Content6`]
  }
  
  extension [Self <: `201ContentApplicationjsonInreplytoidHeadersLocation404Content6`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonInreplytoidHeadersLocation): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
