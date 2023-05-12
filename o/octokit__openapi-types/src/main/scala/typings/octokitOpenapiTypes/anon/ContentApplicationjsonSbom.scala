package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSbom extends StObject {
  
  var content: ApplicationjsonSbom
  
  var headers: LinkString
}
object ContentApplicationjsonSbom {
  
  inline def apply(content: ApplicationjsonSbom, headers: LinkString): ContentApplicationjsonSbom = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSbom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSbom] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSbom): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
