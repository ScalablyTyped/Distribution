package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDismissedreason extends StObject {
  
  var content: ApplicationjsonDismissedreason
}
object ContentApplicationjsonDismissedreason {
  
  inline def apply(content: ApplicationjsonDismissedreason): ContentApplicationjsonDismissedreason = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDismissedreason]
  }
  
  extension [Self <: ContentApplicationjsonDismissedreason](x: Self) {
    
    inline def setContent(value: ApplicationjsonDismissedreason): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
