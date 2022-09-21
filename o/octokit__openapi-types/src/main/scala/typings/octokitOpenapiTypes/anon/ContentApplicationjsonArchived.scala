package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonArchived extends StObject {
  
  var content: ApplicationjsonArchived
}
object ContentApplicationjsonArchived {
  
  inline def apply(content: ApplicationjsonArchived): ContentApplicationjsonArchived = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonArchived]
  }
  
  extension [Self <: ContentApplicationjsonArchived](x: Self) {
    
    inline def setContent(value: ApplicationjsonArchived): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
