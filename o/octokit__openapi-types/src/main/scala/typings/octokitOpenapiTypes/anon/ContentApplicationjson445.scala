package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson445 extends StObject {
  
  var content: Applicationjson445
}
object ContentApplicationjson445 {
  
  inline def apply(content: Applicationjson445): ContentApplicationjson445 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson445]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson445] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson445): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
