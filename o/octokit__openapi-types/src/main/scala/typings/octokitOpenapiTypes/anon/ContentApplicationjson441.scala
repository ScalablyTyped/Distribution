package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson441 extends StObject {
  
  var content: Applicationjson441
}
object ContentApplicationjson441 {
  
  inline def apply(content: Applicationjson441): ContentApplicationjson441 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson441]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson441] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson441): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
