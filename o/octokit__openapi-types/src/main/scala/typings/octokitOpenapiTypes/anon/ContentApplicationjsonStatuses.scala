package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonStatuses extends StObject {
  
  var content: ApplicationjsonStatuses
}
object ContentApplicationjsonStatuses {
  
  inline def apply(content: ApplicationjsonStatuses): ContentApplicationjsonStatuses = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonStatuses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonStatuses] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonStatuses): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
