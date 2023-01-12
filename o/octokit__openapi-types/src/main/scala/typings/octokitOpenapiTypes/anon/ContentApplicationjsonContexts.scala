package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContexts extends StObject {
  
  var content: ApplicationjsonContexts
}
object ContentApplicationjsonContexts {
  
  inline def apply(content: ApplicationjsonContexts): ContentApplicationjsonContexts = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContexts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonContexts] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonContexts): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
