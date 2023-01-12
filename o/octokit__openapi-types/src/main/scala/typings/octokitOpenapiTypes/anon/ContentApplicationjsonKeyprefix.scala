package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonKeyprefix extends StObject {
  
  var content: ApplicationjsonKeyprefix
  
  var headers: Location
}
object ContentApplicationjsonKeyprefix {
  
  inline def apply(content: ApplicationjsonKeyprefix, headers: Location): ContentApplicationjsonKeyprefix = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonKeyprefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonKeyprefix] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonKeyprefix): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
