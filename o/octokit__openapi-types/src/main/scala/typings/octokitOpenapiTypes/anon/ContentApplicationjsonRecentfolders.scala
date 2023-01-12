package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRecentfolders extends StObject {
  
  var content: ApplicationjsonRecentfolders
}
object ContentApplicationjsonRecentfolders {
  
  inline def apply(content: ApplicationjsonRecentfolders): ContentApplicationjsonRecentfolders = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRecentfolders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRecentfolders] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRecentfolders): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
