package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson448 extends StObject {
  
  var content: Applicationjson448
  
  var headers: Link
}
object ContentApplicationjson448 {
  
  inline def apply(content: Applicationjson448, headers: Link): ContentApplicationjson448 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson448]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson448] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson448): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
