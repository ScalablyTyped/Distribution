package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllowautomerge extends StObject {
  
  var content: ApplicationjsonAllowautomerge
}
object ContentApplicationjsonAllowautomerge {
  
  inline def apply(content: ApplicationjsonAllowautomerge): ContentApplicationjsonAllowautomerge = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllowautomerge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAllowautomerge] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAllowautomerge): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
