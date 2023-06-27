package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content457HeadersLink extends StObject {
  
  var content: `457`
  
  var headers: Link
}
object Content457HeadersLink {
  
  inline def apply(content: `457`, headers: Link): Content457HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content457HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content457HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `457`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
