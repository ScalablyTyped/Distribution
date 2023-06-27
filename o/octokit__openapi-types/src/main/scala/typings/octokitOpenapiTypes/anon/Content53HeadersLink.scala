package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content53HeadersLink extends StObject {
  
  var content: `53`
  
  var headers: Link
}
object Content53HeadersLink {
  
  inline def apply(content: `53`, headers: Link): Content53HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content53HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content53HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `53`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
