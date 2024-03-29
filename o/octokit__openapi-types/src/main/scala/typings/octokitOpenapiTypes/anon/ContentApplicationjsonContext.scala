package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContext extends StObject {
  
  var content: ApplicationjsonContext
}
object ContentApplicationjsonContext {
  
  inline def apply(content: ApplicationjsonContext): ContentApplicationjsonContext = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonContext] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonContext): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
