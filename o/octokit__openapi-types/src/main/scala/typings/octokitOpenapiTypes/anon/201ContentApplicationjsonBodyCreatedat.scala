package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonBodyCreatedat` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonBodyCreatedat
  
  var `304`: Any
  
  var `403`: Content48
  
  var `404`: Content48
}
object `201ContentApplicationjsonBodyCreatedat` {
  
  inline def apply(`201`: ContentApplicationjsonBodyCreatedat, `304`: Any, `403`: Content48, `404`: Content48): `201ContentApplicationjsonBodyCreatedat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonBodyCreatedat`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonBodyCreatedat`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonBodyCreatedat): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
