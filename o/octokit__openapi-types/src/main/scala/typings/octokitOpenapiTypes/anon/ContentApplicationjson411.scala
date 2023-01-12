package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson411 extends StObject {
  
  var content: Applicationjson411
}
object ContentApplicationjson411 {
  
  inline def apply(content: Applicationjson411): ContentApplicationjson411 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson411]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson411] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson411): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
