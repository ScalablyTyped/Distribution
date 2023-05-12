package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNameValue extends StObject {
  
  var content: ApplicationjsonNameValue
}
object ContentApplicationjsonNameValue {
  
  inline def apply(content: ApplicationjsonNameValue): ContentApplicationjsonNameValue = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonNameValue] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonNameValue): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
