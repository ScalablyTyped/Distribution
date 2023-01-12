package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEmails extends StObject {
  
  var content: ApplicationjsonEmails
}
object ContentApplicationjsonEmails {
  
  inline def apply(content: ApplicationjsonEmails): ContentApplicationjsonEmails = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEmails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonEmails] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEmails): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
