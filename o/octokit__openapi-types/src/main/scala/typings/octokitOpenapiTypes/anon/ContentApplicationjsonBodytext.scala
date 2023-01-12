package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodytext extends StObject {
  
  var content: ApplicationjsonBodytext
}
object ContentApplicationjsonBodytext {
  
  inline def apply(content: ApplicationjsonBodytext): ContentApplicationjsonBodytext = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodytext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBodytext] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodytext): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
