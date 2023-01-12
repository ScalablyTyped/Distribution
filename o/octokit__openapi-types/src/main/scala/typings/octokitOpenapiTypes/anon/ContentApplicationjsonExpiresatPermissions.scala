package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonExpiresatPermissions extends StObject {
  
  var content: ApplicationjsonExpiresatPermissions
}
object ContentApplicationjsonExpiresatPermissions {
  
  inline def apply(content: ApplicationjsonExpiresatPermissions): ContentApplicationjsonExpiresatPermissions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonExpiresatPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonExpiresatPermissions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonExpiresatPermissions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
