package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInreplyto extends StObject {
  
  var content: ApplicationjsonInreplyto
}
object ContentApplicationjsonInreplyto {
  
  inline def apply(content: ApplicationjsonInreplyto): ContentApplicationjsonInreplyto = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInreplyto]
  }
  
  extension [Self <: ContentApplicationjsonInreplyto](x: Self) {
    
    inline def setContent(value: ApplicationjsonInreplyto): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
