package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersContentType extends StObject {
  
  var content: Texthtml
  
  var headers: ContentType_
}
object HeadersContentType {
  
  inline def apply(content: Texthtml, headers: ContentType_): HeadersContentType = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersContentType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadersContentType] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Texthtml): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: ContentType_): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
