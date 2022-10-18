package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonActiveConfigEvents extends StObject {
  
  var content: ApplicationjsonActiveConfigEvents
}
object ContentApplicationjsonActiveConfigEvents {
  
  inline def apply(content: ApplicationjsonActiveConfigEvents): ContentApplicationjsonActiveConfigEvents = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonActiveConfigEvents]
  }
  
  extension [Self <: ContentApplicationjsonActiveConfigEvents](x: Self) {
    
    inline def setContent(value: ApplicationjsonActiveConfigEvents): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
