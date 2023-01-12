package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPermission extends StObject {
  
  var content: ApplicationjsonPermission
}
object ContentApplicationjsonPermission {
  
  inline def apply(content: ApplicationjsonPermission): ContentApplicationjsonPermission = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonPermission] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonPermission): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
