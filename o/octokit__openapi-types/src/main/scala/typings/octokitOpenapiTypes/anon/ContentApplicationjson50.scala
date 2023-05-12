package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson50 extends StObject {
  
  var content: Applicationjson50
}
object ContentApplicationjson50 {
  
  inline def apply(content: Applicationjson50): ContentApplicationjson50 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson50]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson50] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson50): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
