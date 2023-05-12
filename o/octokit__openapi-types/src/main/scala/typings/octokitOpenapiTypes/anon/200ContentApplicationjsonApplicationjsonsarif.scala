package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonApplicationjsonsarif` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonApplicationjsonsarif
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200ContentApplicationjsonApplicationjsonsarif` {
  
  inline def apply(
    `200`: ContentApplicationjsonApplicationjsonsarif,
    `403`: Content36,
    `404`: Content36,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `200ContentApplicationjsonApplicationjsonsarif` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonApplicationjsonsarif`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonApplicationjsonsarif`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonApplicationjsonsarif): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
