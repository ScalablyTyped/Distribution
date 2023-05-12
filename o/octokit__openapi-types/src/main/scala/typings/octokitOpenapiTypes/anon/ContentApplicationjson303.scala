package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson303 extends StObject {
  
  var content: Applicationjson303
}
object ContentApplicationjson303 {
  
  inline def apply(content: Applicationjson303): ContentApplicationjson303 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson303]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson303] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson303): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
