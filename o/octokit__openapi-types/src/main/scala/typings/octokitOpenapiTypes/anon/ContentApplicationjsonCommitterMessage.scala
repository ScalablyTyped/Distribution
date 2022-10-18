package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCommitterMessage extends StObject {
  
  var content: ApplicationjsonCommitterMessage
}
object ContentApplicationjsonCommitterMessage {
  
  inline def apply(content: ApplicationjsonCommitterMessage): ContentApplicationjsonCommitterMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCommitterMessage]
  }
  
  extension [Self <: ContentApplicationjsonCommitterMessage](x: Self) {
    
    inline def setContent(value: ApplicationjsonCommitterMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
