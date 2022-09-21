package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyHtmlurl extends StObject {
  
  var content: ApplicationjsonBodyHtmlurl
}
object ContentApplicationjsonBodyHtmlurl {
  
  inline def apply(content: ApplicationjsonBodyHtmlurl): ContentApplicationjsonBodyHtmlurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyHtmlurl]
  }
  
  extension [Self <: ContentApplicationjsonBodyHtmlurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyHtmlurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
