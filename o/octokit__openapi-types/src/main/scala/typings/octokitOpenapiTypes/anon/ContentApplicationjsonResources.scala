package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonResources extends StObject {
  
  var content: ApplicationjsonResources
  
  var headers: XRateLimitRemaining
}
object ContentApplicationjsonResources {
  
  inline def apply(content: ApplicationjsonResources, headers: XRateLimitRemaining): ContentApplicationjsonResources = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonResources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonResources] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonResources): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: XRateLimitRemaining): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
