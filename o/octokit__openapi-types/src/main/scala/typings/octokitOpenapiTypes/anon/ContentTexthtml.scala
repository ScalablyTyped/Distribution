package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTexthtml extends StObject {
  
  var content: Texthtml
  
  var headers: ContentLength
}
object ContentTexthtml {
  
  inline def apply(content: Texthtml, headers: ContentLength): ContentTexthtml = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTexthtml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentTexthtml] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Texthtml): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: ContentLength): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
