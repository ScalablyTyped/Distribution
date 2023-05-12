package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson505 extends StObject {
  
  var content: Applicationjson505
  
  var headers: LinkString
}
object ContentApplicationjson505 {
  
  inline def apply(content: Applicationjson505, headers: LinkString): ContentApplicationjson505 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson505]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson505] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson505): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
