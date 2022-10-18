package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllowmergecommit extends StObject {
  
  var content: ApplicationjsonAllowmergecommit
  
  var headers: Location
}
object ContentApplicationjsonAllowmergecommit {
  
  inline def apply(content: ApplicationjsonAllowmergecommit, headers: Location): ContentApplicationjsonAllowmergecommit = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllowmergecommit]
  }
  
  extension [Self <: ContentApplicationjsonAllowmergecommit](x: Self) {
    
    inline def setContent(value: ApplicationjsonAllowmergecommit): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
