package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonBaseroleCreatedat` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonBaseroleCreatedat
  
  var `404`: Content55
  
  var `422`: Content421
}
object `201ContentApplicationjsonBaseroleCreatedat` {
  
  inline def apply(`201`: ContentApplicationjsonBaseroleCreatedat, `404`: Content55, `422`: Content421): `201ContentApplicationjsonBaseroleCreatedat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonBaseroleCreatedat`]
  }
  
  extension [Self <: `201ContentApplicationjsonBaseroleCreatedat`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonBaseroleCreatedat): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
