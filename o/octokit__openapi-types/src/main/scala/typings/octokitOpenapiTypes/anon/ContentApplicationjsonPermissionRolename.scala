package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPermissionRolename extends StObject {
  
  var content: ApplicationjsonPermissionRolename
}
object ContentApplicationjsonPermissionRolename {
  
  inline def apply(content: ApplicationjsonPermissionRolename): ContentApplicationjsonPermissionRolename = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPermissionRolename]
  }
  
  extension [Self <: ContentApplicationjsonPermissionRolename](x: Self) {
    
    inline def setContent(value: ApplicationjsonPermissionRolename): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
