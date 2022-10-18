package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPermissionUser extends StObject {
  
  var content: ApplicationjsonPermissionUser
}
object ContentApplicationjsonPermissionUser {
  
  inline def apply(content: ApplicationjsonPermissionUser): ContentApplicationjsonPermissionUser = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPermissionUser]
  }
  
  extension [Self <: ContentApplicationjsonPermissionUser](x: Self) {
    
    inline def setContent(value: ApplicationjsonPermissionUser): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
