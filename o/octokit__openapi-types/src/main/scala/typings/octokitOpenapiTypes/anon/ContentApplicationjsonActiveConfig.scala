package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonActiveConfig extends StObject {
  
  var content: ApplicationjsonActiveConfig
}
object ContentApplicationjsonActiveConfig {
  
  inline def apply(content: ApplicationjsonActiveConfig): ContentApplicationjsonActiveConfig = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonActiveConfig]
  }
  
  extension [Self <: ContentApplicationjsonActiveConfig](x: Self) {
    
    inline def setContent(value: ApplicationjsonActiveConfig): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
