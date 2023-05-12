package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403ContentApplicationjsonDocumentationurl404Content36` extends StObject {
  
  /** @description Forbidden if the project is not owned by the organization */
  var `403`: ContentApplicationjsonDocumentationurl
  
  var `404`: Content36
  
  var `422`: Content346
}
object `403ContentApplicationjsonDocumentationurl404Content36` {
  
  inline def apply(`403`: ContentApplicationjsonDocumentationurl, `404`: Content36, `422`: Content346): `403ContentApplicationjsonDocumentationurl404Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403ContentApplicationjsonDocumentationurl404Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403ContentApplicationjsonDocumentationurl404Content36`] (val x: Self) extends AnyVal {
    
    inline def set403(value: ContentApplicationjsonDocumentationurl): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
