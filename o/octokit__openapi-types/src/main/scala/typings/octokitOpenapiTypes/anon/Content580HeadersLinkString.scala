package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content580HeadersLinkString extends StObject {
  
  var content: `580`
  
  var headers: LinkString
}
object Content580HeadersLinkString {
  
  inline def apply(content: `580`, headers: LinkString): Content580HeadersLinkString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content580HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content580HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `580`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
