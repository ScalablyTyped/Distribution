package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEncoding extends StObject {
  
  var content: ApplicationjsonEncoding
}
object ContentApplicationjsonEncoding {
  
  inline def apply(content: ApplicationjsonEncoding): ContentApplicationjsonEncoding = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonEncoding] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEncoding): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
