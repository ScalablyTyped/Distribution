package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEventMessage extends StObject {
  
  var content: ApplicationjsonEventMessage
}
object ContentApplicationjsonEventMessage {
  
  inline def apply(content: ApplicationjsonEventMessage): ContentApplicationjsonEventMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEventMessage]
  }
  
  extension [Self <: ContentApplicationjsonEventMessage](x: Self) {
    
    inline def setContent(value: ApplicationjsonEventMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
