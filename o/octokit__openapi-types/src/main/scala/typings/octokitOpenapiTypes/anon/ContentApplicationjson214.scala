package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson214 extends StObject {
  
  var content: Applicationjson214
}
object ContentApplicationjson214 {
  
  inline def apply(content: Applicationjson214): ContentApplicationjson214 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson214]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson214] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson214): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
