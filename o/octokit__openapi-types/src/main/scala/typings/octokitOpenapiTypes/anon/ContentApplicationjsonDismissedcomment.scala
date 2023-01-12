package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDismissedcomment extends StObject {
  
  var content: ApplicationjsonDismissedcomment
}
object ContentApplicationjsonDismissedcomment {
  
  inline def apply(content: ApplicationjsonDismissedcomment): ContentApplicationjsonDismissedcomment = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDismissedcomment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDismissedcomment] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDismissedcomment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
