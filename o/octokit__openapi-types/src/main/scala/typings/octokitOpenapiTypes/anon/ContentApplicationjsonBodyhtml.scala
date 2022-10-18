package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyhtml extends StObject {
  
  var content: ApplicationjsonBodyhtml
}
object ContentApplicationjsonBodyhtml {
  
  inline def apply(content: ApplicationjsonBodyhtml): ContentApplicationjsonBodyhtml = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyhtml]
  }
  
  extension [Self <: ContentApplicationjsonBodyhtml](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyhtml): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
