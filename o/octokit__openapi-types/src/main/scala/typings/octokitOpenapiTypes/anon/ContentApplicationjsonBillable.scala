package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBillable extends StObject {
  
  var content: ApplicationjsonBillable
}
object ContentApplicationjsonBillable {
  
  inline def apply(content: ApplicationjsonBillable): ContentApplicationjsonBillable = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBillable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBillable] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBillable): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
