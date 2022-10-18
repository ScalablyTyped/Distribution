package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200404409` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCommitContent
  
  var `404`: Content6
  
  var `409`: Content6
  
  var `422`: Content8
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `200404409` {
  
  inline def apply(
    `200`: ContentApplicationjsonCommitContent,
    `404`: Content6,
    `409`: Content6,
    `422`: Content8,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `200404409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200404409`]
  }
  
  extension [Self <: `200404409`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCommitContent): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content6): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
