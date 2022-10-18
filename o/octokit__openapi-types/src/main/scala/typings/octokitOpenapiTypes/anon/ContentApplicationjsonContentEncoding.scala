package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContentEncoding extends StObject {
  
  var content: ApplicationjsonContentEncoding
}
object ContentApplicationjsonContentEncoding {
  
  inline def apply(content: ApplicationjsonContentEncoding): ContentApplicationjsonContentEncoding = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContentEncoding]
  }
  
  extension [Self <: ContentApplicationjsonContentEncoding](x: Self) {
    
    inline def setContent(value: ApplicationjsonContentEncoding): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
