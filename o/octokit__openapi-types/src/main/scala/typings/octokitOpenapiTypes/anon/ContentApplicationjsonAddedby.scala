package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAddedby extends StObject {
  
  var content: ApplicationjsonAddedby
  
  var headers: Location
}
object ContentApplicationjsonAddedby {
  
  inline def apply(content: ApplicationjsonAddedby, headers: Location): ContentApplicationjsonAddedby = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAddedby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAddedby] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAddedby): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
