package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSelectedusernamesArray extends StObject {
  
  var content: ApplicationjsonSelectedusernamesArray
}
object ContentApplicationjsonSelectedusernamesArray {
  
  inline def apply(content: ApplicationjsonSelectedusernamesArray): ContentApplicationjsonSelectedusernamesArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSelectedusernamesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSelectedusernamesArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSelectedusernamesArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
