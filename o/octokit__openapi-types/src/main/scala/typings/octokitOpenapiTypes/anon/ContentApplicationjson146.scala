package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson146 extends StObject {
  
  var content: Applicationjson146
}
object ContentApplicationjson146 {
  
  inline def apply(content: Applicationjson146): ContentApplicationjson146 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson146]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson146] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson146): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
