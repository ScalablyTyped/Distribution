package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonActive extends StObject {
  
  var content: ApplicationjsonActive
}
object ContentApplicationjsonActive {
  
  inline def apply(content: ApplicationjsonActive): ContentApplicationjsonActive = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonActive] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonActive): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
