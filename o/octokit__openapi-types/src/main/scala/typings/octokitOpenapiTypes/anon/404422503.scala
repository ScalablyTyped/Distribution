package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404422503` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonPushprotectionbypassedby
  
  /** Bad request, resolution comment is invalid or the resolution was not changed. */
  var `400`: Any
  
  /** Repository is public, or secret scanning is disabled for the repository, or the resource is not found */
  var `404`: Any
  
  /** State does not match the resolution or resolution comment */
  var `422`: Any
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `404422503` {
  
  inline def apply(
    `200`: ContentApplicationjsonPushprotectionbypassedby,
    `400`: Any,
    `404`: Any,
    `422`: Any,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `404422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404422503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `404422503`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonPushprotectionbypassedby): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: Any): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
