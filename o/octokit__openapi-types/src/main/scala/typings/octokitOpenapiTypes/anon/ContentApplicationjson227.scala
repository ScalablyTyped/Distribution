package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson227 extends StObject {
  
  var content: Applicationjson227
  
  var headers: Link
}
object ContentApplicationjson227 {
  
  inline def apply(content: Applicationjson227, headers: Link): ContentApplicationjson227 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson227]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson227] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson227): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
