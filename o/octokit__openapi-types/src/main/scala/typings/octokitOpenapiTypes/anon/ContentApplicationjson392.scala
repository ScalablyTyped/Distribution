package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson392 extends StObject {
  
  var content: Applicationjson392
}
object ContentApplicationjson392 {
  
  inline def apply(content: Applicationjson392): ContentApplicationjson392 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson392]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson392] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson392): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
