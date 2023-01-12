package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPermissions extends StObject {
  
  var content: ApplicationjsonPermissions
}
object ContentApplicationjsonPermissions {
  
  inline def apply(content: ApplicationjsonPermissions): ContentApplicationjsonPermissions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonPermissions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonPermissions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
