package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSecret extends StObject {
  
  var content: ApplicationjsonSecret
}
object ContentApplicationjsonSecret {
  
  inline def apply(content: ApplicationjsonSecret): ContentApplicationjsonSecret = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSecret]
  }
  
  extension [Self <: ContentApplicationjsonSecret](x: Self) {
    
    inline def setContent(value: ApplicationjsonSecret): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
