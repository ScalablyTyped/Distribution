package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnabledUrl extends StObject {
  
  var content: ApplicationjsonEnabledUrl
}
object ContentApplicationjsonEnabledUrl {
  
  inline def apply(content: ApplicationjsonEnabledUrl): ContentApplicationjsonEnabledUrl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnabledUrl]
  }
  
  extension [Self <: ContentApplicationjsonEnabledUrl](x: Self) {
    
    inline def setContent(value: ApplicationjsonEnabledUrl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
