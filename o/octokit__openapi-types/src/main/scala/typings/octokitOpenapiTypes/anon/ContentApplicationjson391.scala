package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson391 extends StObject {
  
  var content: Applicationjson391
}
object ContentApplicationjson391 {
  
  inline def apply(content: Applicationjson391): ContentApplicationjson391 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson391]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson391] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson391): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
