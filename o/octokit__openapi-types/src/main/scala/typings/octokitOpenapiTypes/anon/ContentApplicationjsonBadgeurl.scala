package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBadgeurl extends StObject {
  
  var content: ApplicationjsonBadgeurl
}
object ContentApplicationjsonBadgeurl {
  
  inline def apply(content: ApplicationjsonBadgeurl): ContentApplicationjsonBadgeurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBadgeurl]
  }
  
  extension [Self <: ContentApplicationjsonBadgeurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonBadgeurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
