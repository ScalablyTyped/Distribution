package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAutomerge extends StObject {
  
  var content: ApplicationjsonAutomerge
}
object ContentApplicationjsonAutomerge {
  
  inline def apply(content: ApplicationjsonAutomerge): ContentApplicationjsonAutomerge = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAutomerge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAutomerge] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAutomerge): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
