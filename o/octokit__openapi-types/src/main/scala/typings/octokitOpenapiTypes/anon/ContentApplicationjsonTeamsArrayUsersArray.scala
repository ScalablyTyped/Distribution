package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTeamsArrayUsersArray extends StObject {
  
  var content: ApplicationjsonTeamsArrayUsersArray
  
  var headers: LinkString
}
object ContentApplicationjsonTeamsArrayUsersArray {
  
  inline def apply(content: ApplicationjsonTeamsArrayUsersArray, headers: LinkString): ContentApplicationjsonTeamsArrayUsersArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTeamsArrayUsersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTeamsArrayUsersArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTeamsArrayUsersArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
