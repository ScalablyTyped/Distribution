package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAuthorCommentsurl extends StObject {
  
  var content: ApplicationjsonAuthorCommentsurl
}
object ContentApplicationjsonAuthorCommentsurl {
  
  inline def apply(content: ApplicationjsonAuthorCommentsurl): ContentApplicationjsonAuthorCommentsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAuthorCommentsurl]
  }
  
  extension [Self <: ContentApplicationjsonAuthorCommentsurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonAuthorCommentsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
