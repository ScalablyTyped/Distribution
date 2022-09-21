package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonColumnurl extends StObject {
  
  var content: ApplicationjsonColumnurl
}
object ContentApplicationjsonColumnurl {
  
  inline def apply(content: ApplicationjsonColumnurl): ContentApplicationjsonColumnurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonColumnurl]
  }
  
  extension [Self <: ContentApplicationjsonColumnurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonColumnurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
