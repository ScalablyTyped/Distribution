package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `307` extends StObject {
  
  var `307`: Content6
  
  /** If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, a member will get this response: */
  var `403`: ContentApplicationjsonDocumentationurlMessage
  
  var `404`: Content6
}
object `307` {
  
  inline def apply(`307`: Content6, `403`: ContentApplicationjsonDocumentationurlMessage, `404`: Content6): `307` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("307")(`307`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`307`]
  }
  
  extension [Self <: `307`](x: Self) {
    
    inline def set307(value: Content6): Self = StObject.set(x, "307", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
