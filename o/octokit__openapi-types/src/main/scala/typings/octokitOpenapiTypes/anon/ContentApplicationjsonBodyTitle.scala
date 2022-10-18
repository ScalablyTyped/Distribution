package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyTitle extends StObject {
  
  var content: ApplicationjsonBodyTitle
}
object ContentApplicationjsonBodyTitle {
  
  inline def apply(content: ApplicationjsonBodyTitle): ContentApplicationjsonBodyTitle = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyTitle]
  }
  
  extension [Self <: ContentApplicationjsonBodyTitle](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyTitle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
