package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCheckrunurl extends StObject {
  
  var content: ApplicationjsonCheckrunurl
}
object ContentApplicationjsonCheckrunurl {
  
  inline def apply(content: ApplicationjsonCheckrunurl): ContentApplicationjsonCheckrunurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCheckrunurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCheckrunurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCheckrunurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
