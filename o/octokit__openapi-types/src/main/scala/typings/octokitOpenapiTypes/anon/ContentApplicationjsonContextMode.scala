package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContextMode extends StObject {
  
  var content: ApplicationjsonContextMode
}
object ContentApplicationjsonContextMode {
  
  inline def apply(content: ApplicationjsonContextMode): ContentApplicationjsonContextMode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContextMode]
  }
  
  extension [Self <: ContentApplicationjsonContextMode](x: Self) {
    
    inline def setContent(value: ApplicationjsonContextMode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
