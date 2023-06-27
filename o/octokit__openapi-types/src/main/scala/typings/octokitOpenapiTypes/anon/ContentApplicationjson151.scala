package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson151 extends StObject {
  
  var content: Applicationjson151
}
object ContentApplicationjson151 {
  
  inline def apply(content: Applicationjson151): ContentApplicationjson151 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson151]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson151] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson151): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
