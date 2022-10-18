package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAll extends StObject {
  
  var content: ApplicationjsonAll
}
object ContentApplicationjsonAll {
  
  inline def apply(content: ApplicationjsonAll): ContentApplicationjsonAll = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAll]
  }
  
  extension [Self <: ContentApplicationjsonAll](x: Self) {
    
    inline def setContent(value: ApplicationjsonAll): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
