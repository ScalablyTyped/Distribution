package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonConfigEventsName extends StObject {
  
  var content: ApplicationjsonConfigEventsName
}
object ContentApplicationjsonConfigEventsName {
  
  inline def apply(content: ApplicationjsonConfigEventsName): ContentApplicationjsonConfigEventsName = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonConfigEventsName]
  }
  
  extension [Self <: ContentApplicationjsonConfigEventsName](x: Self) {
    
    inline def setContent(value: ApplicationjsonConfigEventsName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
