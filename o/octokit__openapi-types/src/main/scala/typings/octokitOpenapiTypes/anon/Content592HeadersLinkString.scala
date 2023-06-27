package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content592HeadersLinkString extends StObject {
  
  var content: `592`
  
  var headers: LinkString
}
object Content592HeadersLinkString {
  
  inline def apply(content: `592`, headers: LinkString): Content592HeadersLinkString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content592HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content592HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `592`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
