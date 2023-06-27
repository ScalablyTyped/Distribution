package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson523 extends StObject {
  
  var content: Applicationjson523
}
object ContentApplicationjson523 {
  
  inline def apply(content: Applicationjson523): ContentApplicationjson523 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson523]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson523] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson523): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
