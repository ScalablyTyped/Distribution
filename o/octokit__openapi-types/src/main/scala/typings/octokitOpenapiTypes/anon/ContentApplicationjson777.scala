package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson777 extends StObject {
  
  var content: Applicationjson777
}
object ContentApplicationjson777 {
  
  inline def apply(content: Applicationjson777): ContentApplicationjson777 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson777]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson777] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson777): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
