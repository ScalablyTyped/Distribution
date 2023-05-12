package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson165 extends StObject {
  
  var content: Applicationjson165
}
object ContentApplicationjson165 {
  
  inline def apply(content: Applicationjson165): ContentApplicationjson165 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson165]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson165] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson165): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
