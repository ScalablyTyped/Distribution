package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonGitstatus extends StObject {
  
  var content: ApplicationjsonGitstatus
}
object ContentApplicationjsonGitstatus {
  
  inline def apply(content: ApplicationjsonGitstatus): ContentApplicationjsonGitstatus = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonGitstatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonGitstatus] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonGitstatus): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
