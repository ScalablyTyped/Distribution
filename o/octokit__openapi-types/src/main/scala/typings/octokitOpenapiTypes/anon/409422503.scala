package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409422503` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonCommitContent
  
  var `404`: Content36
  
  var `409`: Content36
  
  var `422`: Content346
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `409422503` {
  
  inline def apply(
    `200`: ContentApplicationjsonCommitContent,
    `404`: Content36,
    `409`: Content36,
    `422`: Content346,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `409422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`409422503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `409422503`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCommitContent): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content36): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
