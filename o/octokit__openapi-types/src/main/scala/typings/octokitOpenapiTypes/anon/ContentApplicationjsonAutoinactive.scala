package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAutoinactive extends StObject {
  
  var content: ApplicationjsonAutoinactive
}
object ContentApplicationjsonAutoinactive {
  
  inline def apply(content: ApplicationjsonAutoinactive): ContentApplicationjsonAutoinactive = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAutoinactive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAutoinactive] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAutoinactive): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
