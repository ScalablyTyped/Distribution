package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonVisibility extends StObject {
  
  var content: ApplicationjsonVisibility
}
object ContentApplicationjsonVisibility {
  
  inline def apply(content: ApplicationjsonVisibility): ContentApplicationjsonVisibility = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonVisibility]
  }
  
  extension [Self <: ContentApplicationjsonVisibility](x: Self) {
    
    inline def setContent(value: ApplicationjsonVisibility): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
