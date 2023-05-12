package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRunurl extends StObject {
  
  var content: ApplicationjsonRunurl
}
object ContentApplicationjsonRunurl {
  
  inline def apply(content: ApplicationjsonRunurl): ContentApplicationjsonRunurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRunurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRunurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRunurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
