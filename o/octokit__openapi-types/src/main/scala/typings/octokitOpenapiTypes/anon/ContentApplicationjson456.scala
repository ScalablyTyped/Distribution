package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson456 extends StObject {
  
  var content: Applicationjson456
}
object ContentApplicationjson456 {
  
  inline def apply(content: Applicationjson456): ContentApplicationjson456 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson456]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson456] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson456): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
