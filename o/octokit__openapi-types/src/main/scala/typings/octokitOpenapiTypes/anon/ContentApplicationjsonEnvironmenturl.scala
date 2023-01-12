package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnvironmenturl extends StObject {
  
  var content: ApplicationjsonEnvironmenturl
  
  var headers: Location
}
object ContentApplicationjsonEnvironmenturl {
  
  inline def apply(content: ApplicationjsonEnvironmenturl, headers: Location): ContentApplicationjsonEnvironmenturl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnvironmenturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonEnvironmenturl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEnvironmenturl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
