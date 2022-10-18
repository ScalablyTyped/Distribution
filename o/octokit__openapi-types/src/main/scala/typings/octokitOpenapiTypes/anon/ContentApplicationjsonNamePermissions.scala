package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNamePermissions extends StObject {
  
  var content: ApplicationjsonNamePermissions
}
object ContentApplicationjsonNamePermissions {
  
  inline def apply(content: ApplicationjsonNamePermissions): ContentApplicationjsonNamePermissions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNamePermissions]
  }
  
  extension [Self <: ContentApplicationjsonNamePermissions](x: Self) {
    
    inline def setContent(value: ApplicationjsonNamePermissions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
