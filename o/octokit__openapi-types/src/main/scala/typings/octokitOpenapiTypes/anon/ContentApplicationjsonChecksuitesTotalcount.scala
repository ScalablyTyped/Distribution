package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonChecksuitesTotalcount extends StObject {
  
  var content: ApplicationjsonChecksuitesTotalcount
  
  var headers: LinkString
}
object ContentApplicationjsonChecksuitesTotalcount {
  
  inline def apply(content: ApplicationjsonChecksuitesTotalcount, headers: LinkString): ContentApplicationjsonChecksuitesTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonChecksuitesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonChecksuitesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonChecksuitesTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
