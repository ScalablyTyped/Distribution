package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson542 extends StObject {
  
  var content: Applicationjson542
  
  var headers: LinkString
}
object ContentApplicationjson542 {
  
  inline def apply(content: Applicationjson542, headers: LinkString): ContentApplicationjson542 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson542]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson542] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson542): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
