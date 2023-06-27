package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson318 extends StObject {
  
  var content: Applicationjson318
}
object ContentApplicationjson318 {
  
  inline def apply(content: Applicationjson318): ContentApplicationjson318 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson318]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson318] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson318): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
