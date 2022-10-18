package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonChecksContexts extends StObject {
  
  var content: ApplicationjsonChecksContexts
}
object ContentApplicationjsonChecksContexts {
  
  inline def apply(content: ApplicationjsonChecksContexts): ContentApplicationjsonChecksContexts = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonChecksContexts]
  }
  
  extension [Self <: ContentApplicationjsonChecksContexts](x: Self) {
    
    inline def setContent(value: ApplicationjsonChecksContexts): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
