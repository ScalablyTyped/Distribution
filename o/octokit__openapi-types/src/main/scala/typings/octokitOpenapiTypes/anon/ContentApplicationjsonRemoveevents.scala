package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRemoveevents extends StObject {
  
  var content: ApplicationjsonRemoveevents
}
object ContentApplicationjsonRemoveevents {
  
  inline def apply(content: ApplicationjsonRemoveevents): ContentApplicationjsonRemoveevents = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRemoveevents]
  }
  
  extension [Self <: ContentApplicationjsonRemoveevents](x: Self) {
    
    inline def setContent(value: ApplicationjsonRemoveevents): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
