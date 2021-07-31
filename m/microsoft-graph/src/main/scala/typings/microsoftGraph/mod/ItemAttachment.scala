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
  
  @scala.inline
  def apply(): ItemAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemAttachment]
  }
  
  @scala.inline
  implicit class ItemAttachmentMutableBuilder[Self <: ItemAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: NullableOption[OutlookItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNull: Self = StObject.set(x, "item", null)
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
