package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBillableowner extends StObject {
  
  var content: ApplicationjsonBillableowner
}
object ContentApplicationjsonBillableowner {
  
  inline def apply(content: ApplicationjsonBillableowner): ContentApplicationjsonBillableowner = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBillableowner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBillableowner] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBillableowner): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
