package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonItemsArrayTotalcountNumber extends StObject {
  
  var content: ApplicationjsonItemsArrayTotalcountNumber
}
object ContentApplicationjsonItemsArrayTotalcountNumber {
  
  inline def apply(content: ApplicationjsonItemsArrayTotalcountNumber): ContentApplicationjsonItemsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonItemsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonItemsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonItemsArrayTotalcountNumber): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
