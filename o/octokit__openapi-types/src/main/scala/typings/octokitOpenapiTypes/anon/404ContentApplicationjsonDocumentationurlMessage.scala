package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404ContentApplicationjsonDocumentationurlMessage` extends StObject {
  
  /** @description Response if `assignee` can not be assigned to `issue_number` */
  var `404`: ContentApplicationjsonDocumentationurlMessage
}
object `404ContentApplicationjsonDocumentationurlMessage` {
  
  inline def apply(`404`: ContentApplicationjsonDocumentationurlMessage): `404ContentApplicationjsonDocumentationurlMessage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404ContentApplicationjsonDocumentationurlMessage`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `404ContentApplicationjsonDocumentationurlMessage`] (val x: Self) extends AnyVal {
    
    inline def set404(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
