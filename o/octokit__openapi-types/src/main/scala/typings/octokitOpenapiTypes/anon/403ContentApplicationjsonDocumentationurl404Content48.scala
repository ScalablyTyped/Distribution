package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403ContentApplicationjsonDocumentationurl404Content48` extends StObject {
  
  /** Forbidden if the project is not owned by the organization */
  var `403`: ContentApplicationjsonDocumentationurl
  
  var `404`: Content48
  
  var `422`: Content397
}
object `403ContentApplicationjsonDocumentationurl404Content48` {
  
  inline def apply(`403`: ContentApplicationjsonDocumentationurl, `404`: Content48, `422`: Content397): `403ContentApplicationjsonDocumentationurl404Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403ContentApplicationjsonDocumentationurl404Content48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403ContentApplicationjsonDocumentationurl404Content48`] (val x: Self) extends AnyVal {
    
    inline def set403(value: ContentApplicationjsonDocumentationurl): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
