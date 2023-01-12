package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson345 extends StObject {
  
  var content: Applicationjson345
}
object ContentApplicationjson345 {
  
  inline def apply(content: Applicationjson345): ContentApplicationjson345 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson345]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson345] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson345): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
