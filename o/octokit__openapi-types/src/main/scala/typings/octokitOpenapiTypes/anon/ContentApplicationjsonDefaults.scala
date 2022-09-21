package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDefaults extends StObject {
  
  var content: ApplicationjsonDefaults
}
object ContentApplicationjsonDefaults {
  
  inline def apply(content: ApplicationjsonDefaults): ContentApplicationjsonDefaults = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDefaults]
  }
  
  extension [Self <: ContentApplicationjsonDefaults](x: Self) {
    
    inline def setContent(value: ApplicationjsonDefaults): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
