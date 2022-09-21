package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyString extends StObject {
  
  var content: ApplicationjsonBodyString
}
object ContentApplicationjsonBodyString {
  
  inline def apply(content: ApplicationjsonBodyString): ContentApplicationjsonBodyString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyString]
  }
  
  extension [Self <: ContentApplicationjsonBodyString](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
