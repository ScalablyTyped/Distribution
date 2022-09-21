package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMeta extends StObject {
  
  var content: ApplicationjsonMeta
}
object ContentApplicationjsonMeta {
  
  inline def apply(content: ApplicationjsonMeta): ContentApplicationjsonMeta = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMeta]
  }
  
  extension [Self <: ContentApplicationjsonMeta](x: Self) {
    
    inline def setContent(value: ApplicationjsonMeta): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
