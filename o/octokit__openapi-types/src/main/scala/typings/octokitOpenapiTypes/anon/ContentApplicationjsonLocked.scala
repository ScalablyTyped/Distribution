package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLocked extends StObject {
  
  var content: ApplicationjsonLocked
  
  var headers: Location
}
object ContentApplicationjsonLocked {
  
  inline def apply(content: ApplicationjsonLocked, headers: Location): ContentApplicationjsonLocked = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLocked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonLocked] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonLocked): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
