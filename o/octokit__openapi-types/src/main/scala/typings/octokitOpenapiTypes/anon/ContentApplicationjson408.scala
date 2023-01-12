package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson408 extends StObject {
  
  var content: Applicationjson408
}
object ContentApplicationjson408 {
  
  inline def apply(content: Applicationjson408): ContentApplicationjson408 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson408]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson408] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson408): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
