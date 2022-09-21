package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPageurl extends StObject {
  
  var content: ApplicationjsonPageurl
}
object ContentApplicationjsonPageurl {
  
  inline def apply(content: ApplicationjsonPageurl): ContentApplicationjsonPageurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPageurl]
  }
  
  extension [Self <: ContentApplicationjsonPageurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonPageurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
