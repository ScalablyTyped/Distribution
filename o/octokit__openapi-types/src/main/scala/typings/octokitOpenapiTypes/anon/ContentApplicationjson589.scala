package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson589 extends StObject {
  
  var content: Applicationjson589
  
  var headers: LinkString
}
object ContentApplicationjson589 {
  
  inline def apply(content: Applicationjson589, headers: LinkString): ContentApplicationjson589 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson589]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson589] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson589): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
