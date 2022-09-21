package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonHeadsha extends StObject {
  
  var content: ApplicationjsonHeadsha
}
object ContentApplicationjsonHeadsha {
  
  inline def apply(content: ApplicationjsonHeadsha): ContentApplicationjsonHeadsha = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonHeadsha]
  }
  
  extension [Self <: ContentApplicationjsonHeadsha](x: Self) {
    
    inline def setContent(value: ApplicationjsonHeadsha): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
