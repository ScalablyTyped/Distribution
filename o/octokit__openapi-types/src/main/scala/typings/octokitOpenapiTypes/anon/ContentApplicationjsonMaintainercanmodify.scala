package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMaintainercanmodify extends StObject {
  
  var content: ApplicationjsonMaintainercanmodify
}
object ContentApplicationjsonMaintainercanmodify {
  
  inline def apply(content: ApplicationjsonMaintainercanmodify): ContentApplicationjsonMaintainercanmodify = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMaintainercanmodify]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonMaintainercanmodify] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMaintainercanmodify): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
