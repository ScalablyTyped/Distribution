package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyEvent extends StObject {
  
  var content: ApplicationjsonBodyEvent
}
object ContentApplicationjsonBodyEvent {
  
  inline def apply(content: ApplicationjsonBodyEvent): ContentApplicationjsonBodyEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBodyEvent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodyEvent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
