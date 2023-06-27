package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content792HeadersLinkString extends StObject {
  
  var content: `792`
  
  var headers: LinkString
}
object Content792HeadersLinkString {
  
  inline def apply(content: `792`, headers: LinkString): Content792HeadersLinkString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content792HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content792HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `792`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
