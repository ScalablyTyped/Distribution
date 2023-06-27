package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content653HeadersLinkString extends StObject {
  
  var content: `653`
  
  var headers: LinkString
}
object Content653HeadersLinkString {
  
  inline def apply(content: `653`, headers: LinkString): Content653HeadersLinkString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content653HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content653HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `653`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
