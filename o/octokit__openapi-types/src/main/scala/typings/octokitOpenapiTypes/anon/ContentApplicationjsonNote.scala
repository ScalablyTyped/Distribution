package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNote extends StObject {
  
  var content: ApplicationjsonNote
}
object ContentApplicationjsonNote {
  
  inline def apply(content: ApplicationjsonNote): ContentApplicationjsonNote = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNote]
  }
  
  extension [Self <: ContentApplicationjsonNote](x: Self) {
    
    inline def setContent(value: ApplicationjsonNote): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
