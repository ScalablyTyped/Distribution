package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBodyHtmlurl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBodyHtmlurl
  
  var `304`: Any
  
  var `404`: Content55
}
object `200ContentApplicationjsonBodyHtmlurl` {
  
  inline def apply(`200`: ContentApplicationjsonBodyHtmlurl, `304`: Any, `404`: Content55): `200ContentApplicationjsonBodyHtmlurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBodyHtmlurl`]
  }
  
  extension [Self <: `200ContentApplicationjsonBodyHtmlurl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBodyHtmlurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
