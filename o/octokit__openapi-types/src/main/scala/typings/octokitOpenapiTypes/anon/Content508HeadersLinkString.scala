package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content508HeadersLinkString extends StObject {
  
  var content: `508`
  
  var headers: LinkString
}
object Content508HeadersLinkString {
  
  inline def apply(content: `508`, headers: LinkString): Content508HeadersLinkString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content508HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content508HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `508`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
