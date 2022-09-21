package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBaseroleCreatedat` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBaseroleCreatedat
  
  var `404`: Content55
  
  var `422`: Content421
}
object `200ContentApplicationjsonBaseroleCreatedat` {
  
  inline def apply(`200`: ContentApplicationjsonBaseroleCreatedat, `404`: Content55, `422`: Content421): `200ContentApplicationjsonBaseroleCreatedat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBaseroleCreatedat`]
  }
  
  extension [Self <: `200ContentApplicationjsonBaseroleCreatedat`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBaseroleCreatedat): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
