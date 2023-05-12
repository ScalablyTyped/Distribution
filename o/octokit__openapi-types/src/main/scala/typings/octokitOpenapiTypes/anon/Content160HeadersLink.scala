package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content160HeadersLink extends StObject {
  
  var content: `160`
  
  var headers: Link
}
object Content160HeadersLink {
  
  inline def apply(content: `160`, headers: Link): Content160HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content160HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content160HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `160`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
