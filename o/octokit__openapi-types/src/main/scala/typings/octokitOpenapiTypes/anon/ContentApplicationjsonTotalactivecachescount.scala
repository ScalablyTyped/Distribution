package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalactivecachescount extends StObject {
  
  var content: ApplicationjsonTotalactivecachescount
  
  var headers: LinkString
}
object ContentApplicationjsonTotalactivecachescount {
  
  inline def apply(content: ApplicationjsonTotalactivecachescount, headers: LinkString): ContentApplicationjsonTotalactivecachescount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalactivecachescount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTotalactivecachescount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTotalactivecachescount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
