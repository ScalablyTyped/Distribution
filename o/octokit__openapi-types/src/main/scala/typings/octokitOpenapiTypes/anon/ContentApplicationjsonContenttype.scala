package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContenttype extends StObject {
  
  var content: ApplicationjsonContenttype
}
object ContentApplicationjsonContenttype {
  
  inline def apply(content: ApplicationjsonContenttype): ContentApplicationjsonContenttype = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContenttype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonContenttype] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonContenttype): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
