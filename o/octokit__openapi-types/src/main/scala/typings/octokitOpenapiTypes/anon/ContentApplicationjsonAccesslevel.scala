package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAccesslevel extends StObject {
  
  var content: ApplicationjsonAccesslevel
}
object ContentApplicationjsonAccesslevel {
  
  inline def apply(content: ApplicationjsonAccesslevel): ContentApplicationjsonAccesslevel = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAccesslevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAccesslevel] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAccesslevel): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
