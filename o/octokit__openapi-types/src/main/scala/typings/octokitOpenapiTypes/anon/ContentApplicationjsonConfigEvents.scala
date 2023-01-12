package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonConfigEvents extends StObject {
  
  var content: ApplicationjsonConfigEvents
}
object ContentApplicationjsonConfigEvents {
  
  inline def apply(content: ApplicationjsonConfigEvents): ContentApplicationjsonConfigEvents = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonConfigEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonConfigEvents] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonConfigEvents): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
