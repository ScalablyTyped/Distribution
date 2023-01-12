package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDismissstalereviews extends StObject {
  
  var content: ApplicationjsonDismissstalereviews
}
object ContentApplicationjsonDismissstalereviews {
  
  inline def apply(content: ApplicationjsonDismissstalereviews): ContentApplicationjsonDismissstalereviews = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDismissstalereviews]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDismissstalereviews] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDismissstalereviews): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
