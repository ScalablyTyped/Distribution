package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDraft extends StObject {
  
  var content: ApplicationjsonDraft
}
object ContentApplicationjsonDraft {
  
  inline def apply(content: ApplicationjsonDraft): ContentApplicationjsonDraft = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDraft]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDraft] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDraft): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
