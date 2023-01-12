package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonShaString extends StObject {
  
  var content: ApplicationjsonShaString
  
  var headers: Location
}
object ContentApplicationjsonShaString {
  
  inline def apply(content: ApplicationjsonShaString, headers: Location): ContentApplicationjsonShaString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonShaString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonShaString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonShaString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
