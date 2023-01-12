package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIncompleteresultsItems extends StObject {
  
  var content: ApplicationjsonIncompleteresultsItems
}
object ContentApplicationjsonIncompleteresultsItems {
  
  inline def apply(content: ApplicationjsonIncompleteresultsItems): ContentApplicationjsonIncompleteresultsItems = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIncompleteresultsItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonIncompleteresultsItems] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonIncompleteresultsItems): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
