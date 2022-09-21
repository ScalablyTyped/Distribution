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
  
  extension [Self <: ContentApplicationjsonClientpayload](x: Self) {
    
    inline def setContent(value: ApplicationjsonClientpayload): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
