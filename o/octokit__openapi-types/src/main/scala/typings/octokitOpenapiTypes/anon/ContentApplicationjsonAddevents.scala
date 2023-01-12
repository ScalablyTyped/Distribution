package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAddevents extends StObject {
  
  var content: ApplicationjsonAddevents
}
object ContentApplicationjsonAddevents {
  
  inline def apply(content: ApplicationjsonAddevents): ContentApplicationjsonAddevents = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAddevents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAddevents] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAddevents): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
