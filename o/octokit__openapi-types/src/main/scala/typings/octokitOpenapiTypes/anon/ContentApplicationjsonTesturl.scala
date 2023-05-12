package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTesturl extends StObject {
  
  var content: ApplicationjsonTesturl
  
  var headers: Location
}
object ContentApplicationjsonTesturl {
  
  inline def apply(content: ApplicationjsonTesturl, headers: Location): ContentApplicationjsonTesturl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTesturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTesturl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTesturl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
