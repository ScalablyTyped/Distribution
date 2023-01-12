package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404422500` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAuthorCommentsurl
  
  var `404`: Content48
  
  var `422`: Content397
  
  var `500`: Content48
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `404422500` {
  
  inline def apply(
    `200`: ContentApplicationjsonAuthorCommentsurl,
    `404`: Content48,
    `422`: Content397,
    `500`: Content48,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `404422500` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404422500`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `404422500`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAuthorCommentsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content48): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
