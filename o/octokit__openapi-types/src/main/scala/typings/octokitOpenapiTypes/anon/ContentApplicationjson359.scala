package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson359 extends StObject {
  
  var content: Applicationjson359
}
object ContentApplicationjson359 {
  
  inline def apply(content: Applicationjson359): ContentApplicationjson359 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson359]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson359] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson359): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
