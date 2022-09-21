package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonExpiryLimit extends StObject {
  
  var content: ApplicationjsonExpiryLimit
}
object ContentApplicationjsonExpiryLimit {
  
  inline def apply(content: ApplicationjsonExpiryLimit): ContentApplicationjsonExpiryLimit = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonExpiryLimit]
  }
  
  extension [Self <: ContentApplicationjsonExpiryLimit](x: Self) {
    
    inline def setContent(value: ApplicationjsonExpiryLimit): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
