package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonGitpullurl extends StObject {
  
  var content: ApplicationjsonGitpullurl
  
  var headers: Location
}
object ContentApplicationjsonGitpullurl {
  
  inline def apply(content: ApplicationjsonGitpullurl, headers: Location): ContentApplicationjsonGitpullurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonGitpullurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonGitpullurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonGitpullurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
