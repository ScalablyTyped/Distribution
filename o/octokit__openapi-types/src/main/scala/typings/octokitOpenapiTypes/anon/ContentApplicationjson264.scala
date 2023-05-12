package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson264 extends StObject {
  
  var content: Applicationjson264
}
object ContentApplicationjson264 {
  
  inline def apply(content: Applicationjson264): ContentApplicationjson264 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson264]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson264] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson264): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
