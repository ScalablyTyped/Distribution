package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson269 extends StObject {
  
  var content: Applicationjson269
  
  var headers: Link
}
object ContentApplicationjson269 {
  
  inline def apply(content: Applicationjson269, headers: Link): ContentApplicationjson269 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson269]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson269] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson269): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
