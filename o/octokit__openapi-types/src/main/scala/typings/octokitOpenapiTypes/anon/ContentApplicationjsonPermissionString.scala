package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPermissionString extends StObject {
  
  var content: ApplicationjsonPermissionString
}
object ContentApplicationjsonPermissionString {
  
  inline def apply(content: ApplicationjsonPermissionString): ContentApplicationjsonPermissionString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPermissionString]
  }
  
  extension [Self <: ContentApplicationjsonPermissionString](x: Self) {
    
    inline def setContent(value: ApplicationjsonPermissionString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
