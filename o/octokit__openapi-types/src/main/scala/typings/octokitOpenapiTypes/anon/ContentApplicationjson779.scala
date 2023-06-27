package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson779 extends StObject {
  
  var content: Applicationjson779
}
object ContentApplicationjson779 {
  
  inline def apply(content: Applicationjson779): ContentApplicationjson779 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson779]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson779] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson779): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
