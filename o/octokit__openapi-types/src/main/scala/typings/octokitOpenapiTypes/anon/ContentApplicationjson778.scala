package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson778 extends StObject {
  
  var content: Applicationjson778
}
object ContentApplicationjson778 {
  
  inline def apply(content: Applicationjson778): ContentApplicationjson778 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson778]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson778] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson778): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
