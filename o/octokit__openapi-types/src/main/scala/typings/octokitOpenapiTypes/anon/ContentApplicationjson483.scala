package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson483 extends StObject {
  
  var content: Applicationjson483
}
object ContentApplicationjson483 {
  
  inline def apply(content: Applicationjson483): ContentApplicationjson483 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson483]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson483] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson483): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
