package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422ContentApplicationjsonDocumentationurl` extends StObject {
  
  /** Unprocessable Entity if user is a member of the organization */
  var `422`: ContentApplicationjsonDocumentationurl
}
object `422ContentApplicationjsonDocumentationurl` {
  
  inline def apply(`422`: ContentApplicationjsonDocumentationurl): `422ContentApplicationjsonDocumentationurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422ContentApplicationjsonDocumentationurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `422ContentApplicationjsonDocumentationurl`] (val x: Self) extends AnyVal {
    
    inline def set422(value: ContentApplicationjsonDocumentationurl): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
