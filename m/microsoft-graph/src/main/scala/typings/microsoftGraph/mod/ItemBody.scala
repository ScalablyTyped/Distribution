package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemBody extends StObject {
  
  // The content of the item.
  var content: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of the content. Possible values are text and html.
  var contentType: js.UndefOr[NullableOption[BodyType]] = js.undefined
}
object ItemBody {
  
  inline def apply(): ItemBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemBody] (val x: Self) extends AnyVal {
    
    inline def setContent(value: NullableOption[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentType(value: NullableOption[BodyType]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
