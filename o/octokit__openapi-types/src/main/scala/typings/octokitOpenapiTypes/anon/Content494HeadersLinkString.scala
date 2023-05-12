package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content494HeadersLinkString extends StObject {
  
  var content: `494`
  
  var headers: LinkString
}
object Content494HeadersLinkString {
  
  inline def apply(content: `494`, headers: LinkString): Content494HeadersLinkString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content494HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content494HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `494`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
