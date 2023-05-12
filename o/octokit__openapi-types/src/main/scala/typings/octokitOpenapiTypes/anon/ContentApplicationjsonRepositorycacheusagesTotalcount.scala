package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositorycacheusagesTotalcount extends StObject {
  
  var content: ApplicationjsonRepositorycacheusagesTotalcount
  
  var headers: LinkString
}
object ContentApplicationjsonRepositorycacheusagesTotalcount {
  
  inline def apply(content: ApplicationjsonRepositorycacheusagesTotalcount, headers: LinkString): ContentApplicationjsonRepositorycacheusagesTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositorycacheusagesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositorycacheusagesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositorycacheusagesTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
