package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDocumentation extends StObject {
  
  var content: ApplicationjsonDocumentation
}
object ContentApplicationjsonDocumentation {
  
  inline def apply(content: ApplicationjsonDocumentation): ContentApplicationjsonDocumentation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDocumentation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDocumentation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDocumentation): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
