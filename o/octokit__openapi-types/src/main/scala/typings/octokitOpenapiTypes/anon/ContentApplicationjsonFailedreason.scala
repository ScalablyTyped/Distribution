package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonFailedreason extends StObject {
  
  var content: ApplicationjsonFailedreason
}
object ContentApplicationjsonFailedreason {
  
  inline def apply(content: ApplicationjsonFailedreason): ContentApplicationjsonFailedreason = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonFailedreason]
  }
  
  extension [Self <: ContentApplicationjsonFailedreason](x: Self) {
    
    inline def setContent(value: ApplicationjsonFailedreason): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
