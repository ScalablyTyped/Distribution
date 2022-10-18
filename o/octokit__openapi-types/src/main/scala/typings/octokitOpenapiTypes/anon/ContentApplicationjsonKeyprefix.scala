package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonKeyprefix extends StObject {
  
  var content: ApplicationjsonKeyprefix
}
object ContentApplicationjsonKeyprefix {
  
  inline def apply(content: ApplicationjsonKeyprefix): ContentApplicationjsonKeyprefix = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonKeyprefix]
  }
  
  extension [Self <: ContentApplicationjsonKeyprefix](x: Self) {
    
    inline def setContent(value: ApplicationjsonKeyprefix): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
