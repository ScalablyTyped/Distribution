package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonEnvironmenturl` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonEnvironmenturl
  
  var `422`: Content421
}
object `201ContentApplicationjsonEnvironmenturl` {
  
  inline def apply(`201`: ContentApplicationjsonEnvironmenturl, `422`: Content421): `201ContentApplicationjsonEnvironmenturl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonEnvironmenturl`]
  }
  
  extension [Self <: `201ContentApplicationjsonEnvironmenturl`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonEnvironmenturl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
