package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLogurl extends StObject {
  
  var content: ApplicationjsonLogurl
  
  var headers: Location
}
object ContentApplicationjsonLogurl {
  
  inline def apply(content: ApplicationjsonLogurl, headers: Location): ContentApplicationjsonLogurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLogurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonLogurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonLogurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
