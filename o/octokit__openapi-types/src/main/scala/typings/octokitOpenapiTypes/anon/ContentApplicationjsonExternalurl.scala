package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonExternalurl extends StObject {
  
  var content: ApplicationjsonExternalurl
}
object ContentApplicationjsonExternalurl {
  
  inline def apply(content: ApplicationjsonExternalurl): ContentApplicationjsonExternalurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonExternalurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonExternalurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonExternalurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
