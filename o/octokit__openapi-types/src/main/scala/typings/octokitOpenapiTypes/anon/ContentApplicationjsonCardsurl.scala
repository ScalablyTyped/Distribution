package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCardsurl extends StObject {
  
  var content: ApplicationjsonCardsurl
}
object ContentApplicationjsonCardsurl {
  
  inline def apply(content: ApplicationjsonCardsurl): ContentApplicationjsonCardsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCardsurl]
  }
  
  extension [Self <: ContentApplicationjsonCardsurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonCardsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
