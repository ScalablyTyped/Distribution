package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `307403` extends StObject {
  
  var `307`: Content48
  
  /** If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, a member will get this response: */
  var `403`: ContentApplicationjsonDocumentationurl
  
  var `404`: Content48
}
object `307403` {
  
  inline def apply(`307`: Content48, `403`: ContentApplicationjsonDocumentationurl, `404`: Content48): `307403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("307")(`307`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`307403`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `307403`] (val x: Self) extends AnyVal {
    
    inline def set307(value: Content48): Self = StObject.set(x, "307", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonDocumentationurl): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
