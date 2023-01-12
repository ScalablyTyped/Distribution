package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBillableWINDOWS extends StObject {
  
  var content: ApplicationjsonBillableWINDOWS
}
object ContentApplicationjsonBillableWINDOWS {
  
  inline def apply(content: ApplicationjsonBillableWINDOWS): ContentApplicationjsonBillableWINDOWS = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBillableWINDOWS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBillableWINDOWS] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBillableWINDOWS): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
