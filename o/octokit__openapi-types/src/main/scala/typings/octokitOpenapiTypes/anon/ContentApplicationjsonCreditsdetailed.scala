package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreditsdetailed extends StObject {
  
  var content: ApplicationjsonCreditsdetailed
}
object ContentApplicationjsonCreditsdetailed {
  
  inline def apply(content: ApplicationjsonCreditsdetailed): ContentApplicationjsonCreditsdetailed = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreditsdetailed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCreditsdetailed] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCreditsdetailed): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
