package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403ContentApplicationjsonDocumentationurl` extends StObject {
  
  /** Forbidden if the project is not owned by the organization */
  var `403`: ContentApplicationjsonDocumentationurl
}
object `403ContentApplicationjsonDocumentationurl` {
  
  inline def apply(`403`: ContentApplicationjsonDocumentationurl): `403ContentApplicationjsonDocumentationurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403ContentApplicationjsonDocumentationurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403ContentApplicationjsonDocumentationurl`] (val x: Self) extends AnyVal {
    
    inline def set403(value: ContentApplicationjsonDocumentationurl): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
