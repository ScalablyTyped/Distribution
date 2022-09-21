package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPattern extends StObject {
  
  var content: ApplicationjsonPattern
}
object ContentApplicationjsonPattern {
  
  inline def apply(content: ApplicationjsonPattern): ContentApplicationjsonPattern = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPattern]
  }
  
  extension [Self <: ContentApplicationjsonPattern](x: Self) {
    
    inline def setContent(value: ApplicationjsonPattern): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
