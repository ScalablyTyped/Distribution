package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403503` extends StObject {
  
  /** Response */
  var `200`: Content417
  
  var `304`: Any
  
  var `403`: Content48
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `403503` {
  
  inline def apply(
    `200`: Content417,
    `304`: Any,
    `403`: Content48,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `403503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403503`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content417): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
