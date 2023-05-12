package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersLinkString extends StObject {
  
  var content: ApplicationjsonCreatedatName
  
  var headers: LinkString
}
object HeadersLinkString {
  
  inline def apply(content: ApplicationjsonCreatedatName, headers: LinkString): HeadersLinkString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCreatedatName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
