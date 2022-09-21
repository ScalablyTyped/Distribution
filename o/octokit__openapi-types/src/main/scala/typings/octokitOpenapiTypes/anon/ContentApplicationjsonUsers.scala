package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonUsers extends StObject {
  
  var content: ApplicationjsonUsers
}
object ContentApplicationjsonUsers {
  
  inline def apply(content: ApplicationjsonUsers): ContentApplicationjsonUsers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonUsers]
  }
  
  extension [Self <: ContentApplicationjsonUsers](x: Self) {
    
    inline def setContent(value: ApplicationjsonUsers): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
