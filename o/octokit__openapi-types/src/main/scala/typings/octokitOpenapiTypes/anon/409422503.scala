package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409422503` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCommitContent
  
  var `404`: Content48
  
  var `409`: Content48
  
  var `422`: Content397
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `409422503` {
  
  inline def apply(
    `200`: ContentApplicationjsonCommitContent,
    `404`: Content48,
    `409`: Content48,
    `422`: Content397,
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
  
  extension [Self <: `409422503`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCommitContent): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content48): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
