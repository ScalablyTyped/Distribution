package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202ContentApplicationjsonUrl` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjsonUrl
  
  var `403`: Content55
  
  var `422`: Content421
}
object `202ContentApplicationjsonUrl` {
  
  inline def apply(`202`: ContentApplicationjsonUrl, `403`: Content55, `422`: Content421): `202ContentApplicationjsonUrl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202ContentApplicationjsonUrl`]
  }
  
  extension [Self <: `202ContentApplicationjsonUrl`](x: Self) {
    
    inline def set202(value: ContentApplicationjsonUrl): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
