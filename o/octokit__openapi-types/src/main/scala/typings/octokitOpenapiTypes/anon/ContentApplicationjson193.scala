package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson193 extends StObject {
  
  var content: Applicationjson193
}
object ContentApplicationjson193 {
  
  inline def apply(content: Applicationjson193): ContentApplicationjson193 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson193]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson193] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson193): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
