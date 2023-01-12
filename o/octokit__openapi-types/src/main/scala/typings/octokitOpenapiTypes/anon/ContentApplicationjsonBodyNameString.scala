package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyNameString extends StObject {
  
  var content: ApplicationjsonBodyNameString
}
object ContentApplicationjsonBodyNameString {
  
  inline def apply(content: ApplicationjsonBodyNameString): ContentApplicationjsonBodyNameString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBodyNameString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodyNameString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
