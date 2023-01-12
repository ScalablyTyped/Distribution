package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonClientpayload extends StObject {
  
  var content: ApplicationjsonClientpayload
}
object ContentApplicationjsonClientpayload {
  
  inline def apply(content: ApplicationjsonClientpayload): ContentApplicationjsonClientpayload = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonClientpayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonClientpayload] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonClientpayload): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
