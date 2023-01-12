package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBusinessplus extends StObject {
  
  var content: ApplicationjsonBusinessplus
}
object ContentApplicationjsonBusinessplus {
  
  inline def apply(content: ApplicationjsonBusinessplus): ContentApplicationjsonBusinessplus = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBusinessplus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBusinessplus] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBusinessplus): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
