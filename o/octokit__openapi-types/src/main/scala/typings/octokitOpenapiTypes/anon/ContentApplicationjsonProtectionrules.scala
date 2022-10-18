package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonProtectionrules extends StObject {
  
  var content: ApplicationjsonProtectionrules
}
object ContentApplicationjsonProtectionrules {
  
  inline def apply(content: ApplicationjsonProtectionrules): ContentApplicationjsonProtectionrules = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonProtectionrules]
  }
  
  extension [Self <: ContentApplicationjsonProtectionrules](x: Self) {
    
    inline def setContent(value: ApplicationjsonProtectionrules): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
