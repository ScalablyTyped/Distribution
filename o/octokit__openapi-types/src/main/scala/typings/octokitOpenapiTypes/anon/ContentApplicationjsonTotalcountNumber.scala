package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalcountNumber extends StObject {
  
  var content: ApplicationjsonTotalcountNumber
}
object ContentApplicationjsonTotalcountNumber {
  
  inline def apply(content: ApplicationjsonTotalcountNumber): ContentApplicationjsonTotalcountNumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTotalcountNumber): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
