package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `304401403404410` extends StObject {
  
  var `304`: Any
  
  var `401`: Content48
  
  /** Forbidden */
  var `403`: ContentApplicationjsonErrors
  
  var `404`: Content48
  
  var `410`: Content48
}
object `304401403404410` {
  
  inline def apply(
    `304`: Any,
    `401`: Content48,
    `403`: ContentApplicationjsonErrors,
    `404`: Content48,
    `410`: Content48
  ): `304401403404410` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`304401403404410`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `304401403404410`] (val x: Self) extends AnyVal {
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonErrors): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content48): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
