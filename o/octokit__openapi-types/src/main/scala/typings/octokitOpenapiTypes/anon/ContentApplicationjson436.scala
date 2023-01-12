package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson436 extends StObject {
  
  var content: Applicationjson436
}
object ContentApplicationjson436 {
  
  inline def apply(content: Applicationjson436): ContentApplicationjson436 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson436]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson436] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson436): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
