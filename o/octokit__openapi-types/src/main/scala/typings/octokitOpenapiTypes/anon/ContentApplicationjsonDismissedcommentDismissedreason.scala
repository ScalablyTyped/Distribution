package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDismissedcommentDismissedreason extends StObject {
  
  var content: ApplicationjsonDismissedcommentDismissedreason
}
object ContentApplicationjsonDismissedcommentDismissedreason {
  
  inline def apply(content: ApplicationjsonDismissedcommentDismissedreason): ContentApplicationjsonDismissedcommentDismissedreason = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDismissedcommentDismissedreason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDismissedcommentDismissedreason] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDismissedcommentDismissedreason): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
