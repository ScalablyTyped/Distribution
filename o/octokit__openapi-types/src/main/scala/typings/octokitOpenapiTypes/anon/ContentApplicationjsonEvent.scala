package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEvent extends StObject {
  
  var content: ApplicationjsonEvent
}
object ContentApplicationjsonEvent {
  
  inline def apply(content: ApplicationjsonEvent): ContentApplicationjsonEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonEvent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEvent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
