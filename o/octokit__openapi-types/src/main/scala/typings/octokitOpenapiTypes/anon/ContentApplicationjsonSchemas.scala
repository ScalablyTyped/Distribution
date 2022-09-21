package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSchemas extends StObject {
  
  var content: ApplicationjsonSchemas
}
object ContentApplicationjsonSchemas {
  
  inline def apply(content: ApplicationjsonSchemas): ContentApplicationjsonSchemas = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSchemas]
  }
  
  extension [Self <: ContentApplicationjsonSchemas](x: Self) {
    
    inline def setContent(value: ApplicationjsonSchemas): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
