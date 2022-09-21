package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonBodyCreatedat` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonBodyCreatedat
  
  var `304`: Any
  
  var `403`: Content55
  
  var `404`: Content55
}
object `201ContentApplicationjsonBodyCreatedat` {
  
  inline def apply(`201`: ContentApplicationjsonBodyCreatedat, `304`: Any, `403`: Content55, `404`: Content55): `201ContentApplicationjsonBodyCreatedat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonBodyCreatedat`]
  }
  
  extension [Self <: `201ContentApplicationjsonBodyCreatedat`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonBodyCreatedat): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
