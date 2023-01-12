package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyColumnsurl extends StObject {
  
  var content: ApplicationjsonBodyColumnsurl
}
object ContentApplicationjsonBodyColumnsurl {
  
  inline def apply(content: ApplicationjsonBodyColumnsurl): ContentApplicationjsonBodyColumnsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyColumnsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBodyColumnsurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodyColumnsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
