package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAccounturls extends StObject {
  
  var content: ApplicationjsonAccounturls
}
object ContentApplicationjsonAccounturls {
  
  inline def apply(content: ApplicationjsonAccounturls): ContentApplicationjsonAccounturls = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAccounturls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAccounturls] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAccounturls): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
