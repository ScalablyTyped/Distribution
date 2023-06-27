package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson642 extends StObject {
  
  var content: Applicationjson642
  
  var headers: LinkString
}
object ContentApplicationjson642 {
  
  inline def apply(content: Applicationjson642, headers: LinkString): ContentApplicationjson642 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson642]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson642] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson642): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
