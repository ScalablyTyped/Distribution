package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCheckrunsTotalcount extends StObject {
  
  var content: ApplicationjsonCheckrunsTotalcount
  
  var headers: LinkString
}
object ContentApplicationjsonCheckrunsTotalcount {
  
  inline def apply(content: ApplicationjsonCheckrunsTotalcount, headers: LinkString): ContentApplicationjsonCheckrunsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCheckrunsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCheckrunsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCheckrunsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
