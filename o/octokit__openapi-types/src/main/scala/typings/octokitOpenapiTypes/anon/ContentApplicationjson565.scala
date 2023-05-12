package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson565 extends StObject {
  
  var content: Applicationjson565
}
object ContentApplicationjson565 {
  
  inline def apply(content: Applicationjson565): ContentApplicationjson565 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson565]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson565] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson565): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
