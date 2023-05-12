package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson128 extends StObject {
  
  var content: Applicationjson128
}
object ContentApplicationjson128 {
  
  inline def apply(content: Applicationjson128): ContentApplicationjson128 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson128]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson128] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson128): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
