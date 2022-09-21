package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonConfig extends StObject {
  
  var content: ApplicationjsonConfig
}
object ContentApplicationjsonConfig {
  
  inline def apply(content: ApplicationjsonConfig): ContentApplicationjsonConfig = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonConfig]
  }
  
  extension [Self <: ContentApplicationjsonConfig](x: Self) {
    
    inline def setContent(value: ApplicationjsonConfig): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
