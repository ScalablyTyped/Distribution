package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonProtectionurl extends StObject {
  
  var content: ApplicationjsonProtectionurl
}
object ContentApplicationjsonProtectionurl {
  
  inline def apply(content: ApplicationjsonProtectionurl): ContentApplicationjsonProtectionurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonProtectionurl]
  }
  
  extension [Self <: ContentApplicationjsonProtectionurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonProtectionurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
