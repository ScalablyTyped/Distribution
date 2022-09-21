package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContenttype extends StObject {
  
  var content: ApplicationjsonContenttype
}
object ContentApplicationjsonContenttype {
  
  inline def apply(content: ApplicationjsonContenttype): ContentApplicationjsonContenttype = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContenttype]
  }
  
  extension [Self <: ContentApplicationjsonContenttype](x: Self) {
    
    inline def setContent(value: ApplicationjsonContenttype): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
