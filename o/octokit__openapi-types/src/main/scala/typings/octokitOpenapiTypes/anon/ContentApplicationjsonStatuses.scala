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
  
  extension [Self <: ContentApplicationjsonStatuses](x: Self) {
    
    inline def setContent(value: ApplicationjsonStatuses): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
