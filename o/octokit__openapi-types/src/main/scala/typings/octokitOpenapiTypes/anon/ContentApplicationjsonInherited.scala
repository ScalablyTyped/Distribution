package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInherited extends StObject {
  
  var content: ApplicationjsonInherited
}
object ContentApplicationjsonInherited {
  
  inline def apply(content: ApplicationjsonInherited): ContentApplicationjsonInherited = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInherited]
  }
  
  extension [Self <: ContentApplicationjsonInherited](x: Self) {
    
    inline def setContent(value: ApplicationjsonInherited): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
