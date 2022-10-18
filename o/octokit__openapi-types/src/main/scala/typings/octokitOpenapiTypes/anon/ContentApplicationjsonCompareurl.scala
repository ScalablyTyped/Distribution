package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCompareurl extends StObject {
  
  var content: ApplicationjsonCompareurl
}
object ContentApplicationjsonCompareurl {
  
  inline def apply(content: ApplicationjsonCompareurl): ContentApplicationjsonCompareurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCompareurl]
  }
  
  extension [Self <: ContentApplicationjsonCompareurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonCompareurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
