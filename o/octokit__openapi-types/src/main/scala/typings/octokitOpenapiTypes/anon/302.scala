package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `302` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonUploader
  
  var `302`: Any
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `302` {
  
  inline def apply(
    `200`: ContentApplicationjsonUploader,
    `302`: Any,
    `403`: Content6,
    `404`: Content6,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `302` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("302")(`302`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`302`]
  }
  
  extension [Self <: `302`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonUploader): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set302(value: Any): Self = StObject.set(x, "302", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
