package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson671 extends StObject {
  
  var content: Applicationjson671
}
object ContentApplicationjson671 {
  
  inline def apply(content: Applicationjson671): ContentApplicationjson671 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson671]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson671] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson671): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
