package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAccesstokenPermissions extends StObject {
  
  var content: ApplicationjsonAccesstokenPermissions
}
object ContentApplicationjsonAccesstokenPermissions {
  
  inline def apply(content: ApplicationjsonAccesstokenPermissions): ContentApplicationjsonAccesstokenPermissions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAccesstokenPermissions]
  }
  
  extension [Self <: ContentApplicationjsonAccesstokenPermissions](x: Self) {
    
    inline def setContent(value: ApplicationjsonAccesstokenPermissions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
