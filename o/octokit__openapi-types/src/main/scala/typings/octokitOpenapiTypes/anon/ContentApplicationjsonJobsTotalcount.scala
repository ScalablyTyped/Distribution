package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonJobsTotalcount extends StObject {
  
  var content: ApplicationjsonJobsTotalcount
  
  var headers: LinkString
}
object ContentApplicationjsonJobsTotalcount {
  
  inline def apply(content: ApplicationjsonJobsTotalcount, headers: LinkString): ContentApplicationjsonJobsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonJobsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonJobsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonJobsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
