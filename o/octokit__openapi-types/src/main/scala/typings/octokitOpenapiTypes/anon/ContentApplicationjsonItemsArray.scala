package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonItemsArray extends StObject {
  
  var content: ApplicationjsonItemsArray
}
object ContentApplicationjsonItemsArray {
  
  inline def apply(content: ApplicationjsonItemsArray): ContentApplicationjsonItemsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonItemsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonItemsArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonItemsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
