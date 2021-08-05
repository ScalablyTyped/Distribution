package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemAttachment
  extends StObject
     with Attachment {
  
  // The attached message or event. Navigation property.
  var item: js.UndefOr[NullableOption[OutlookItem]] = js.undefined
}
object ItemAttachment {
  
  inline def apply(): ItemAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemAttachment]
  }
  
  extension [Self <: ItemAttachment](x: Self) {
    
    inline def setItem(value: NullableOption[OutlookItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemNull: Self = StObject.set(x, "item", null)
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
