package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDefaultDescription extends StObject {
  
  var content: ApplicationjsonDefaultDescription
  
  var headers: Location
}
object ContentApplicationjsonDefaultDescription {
  
  inline def apply(content: ApplicationjsonDefaultDescription, headers: Location): ContentApplicationjsonDefaultDescription = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDefaultDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDefaultDescription] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDefaultDescription): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
