package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403ContentApplicationjsonDocumentationurl404Content55` extends StObject {
  
  /** Forbidden if the project is not owned by the organization */
  var `403`: ContentApplicationjsonDocumentationurl
  
  var `404`: Content55
  
  var `422`: Content421
}
object `403ContentApplicationjsonDocumentationurl404Content55` {
  
  inline def apply(`403`: ContentApplicationjsonDocumentationurl, `404`: Content55, `422`: Content421): `403ContentApplicationjsonDocumentationurl404Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403ContentApplicationjsonDocumentationurl404Content55`]
  }
  
  extension [Self <: `403ContentApplicationjsonDocumentationurl404Content55`](x: Self) {
    
    inline def set403(value: ContentApplicationjsonDocumentationurl): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
