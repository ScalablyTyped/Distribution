package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonHistory extends StObject {
  
  var content: ApplicationjsonHistory
  
  var headers: Location
}
object ContentApplicationjsonHistory {
  
  inline def apply(content: ApplicationjsonHistory, headers: Location): ContentApplicationjsonHistory = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonHistory] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonHistory): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
