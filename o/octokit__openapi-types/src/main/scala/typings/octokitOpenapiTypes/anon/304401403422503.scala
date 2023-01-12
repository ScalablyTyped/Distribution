package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `304401403422503` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonColumnurl
  
  var `304`: Any
  
  var `401`: Content48
  
  var `403`: Content48
  
  /** Validation failed */
  var `422`: Content435
  
  /** Response */
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `304401403422503` {
  
  inline def apply(
    `201`: ContentApplicationjsonColumnurl,
    `304`: Any,
    `401`: Content48,
    `403`: Content48,
    `422`: Content435,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `304401403422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`304401403422503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `304401403422503`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonColumnurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content435): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
