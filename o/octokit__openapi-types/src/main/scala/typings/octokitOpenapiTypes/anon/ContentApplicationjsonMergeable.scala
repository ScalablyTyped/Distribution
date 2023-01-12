package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMergeable extends StObject {
  
  var content: ApplicationjsonMergeable
  
  var headers: Location
}
object ContentApplicationjsonMergeable {
  
  inline def apply(content: ApplicationjsonMergeable, headers: Location): ContentApplicationjsonMergeable = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMergeable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonMergeable] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMergeable): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
