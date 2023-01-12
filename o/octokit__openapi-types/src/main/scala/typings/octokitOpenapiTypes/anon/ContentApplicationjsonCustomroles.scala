package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCustomroles extends StObject {
  
  var content: ApplicationjsonCustomroles
}
object ContentApplicationjsonCustomroles {
  
  inline def apply(content: ApplicationjsonCustomroles): ContentApplicationjsonCustomroles = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCustomroles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCustomroles] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCustomroles): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
