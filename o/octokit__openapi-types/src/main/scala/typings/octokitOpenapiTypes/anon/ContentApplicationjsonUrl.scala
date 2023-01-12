package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonUrl extends StObject {
  
  var content: ApplicationjsonUrl
}
object ContentApplicationjsonUrl {
  
  inline def apply(content: ApplicationjsonUrl): ContentApplicationjsonUrl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonUrl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonUrl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
