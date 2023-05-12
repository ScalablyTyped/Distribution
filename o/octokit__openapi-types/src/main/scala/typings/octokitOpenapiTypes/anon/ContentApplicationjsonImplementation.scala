package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonImplementation extends StObject {
  
  var content: ApplicationjsonImplementation
}
object ContentApplicationjsonImplementation {
  
  inline def apply(content: ApplicationjsonImplementation): ContentApplicationjsonImplementation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonImplementation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonImplementation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonImplementation): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
