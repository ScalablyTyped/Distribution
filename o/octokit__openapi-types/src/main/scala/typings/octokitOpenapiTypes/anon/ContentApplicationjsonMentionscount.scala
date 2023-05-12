package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMentionscount extends StObject {
  
  var content: ApplicationjsonMentionscount
  
  var headers: Location
}
object ContentApplicationjsonMentionscount {
  
  inline def apply(content: ApplicationjsonMentionscount, headers: Location): ContentApplicationjsonMentionscount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMentionscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonMentionscount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMentionscount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
