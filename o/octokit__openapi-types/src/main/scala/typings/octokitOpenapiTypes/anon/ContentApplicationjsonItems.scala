package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonItems extends StObject {
  
  var content: ApplicationjsonItems
}
object ContentApplicationjsonItems {
  
  inline def apply(content: ApplicationjsonItems): ContentApplicationjsonItems = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonItems]
  }
  
  extension [Self <: ContentApplicationjsonItems](x: Self) {
    
    inline def setContent(value: ApplicationjsonItems): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
