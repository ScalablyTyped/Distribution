package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemReason extends StObject {
  
  /**
    * An object containing information about the specific item that has been changed.
    */
  var item: js.UndefOr[typings.openui5.sapMP13nBasePanelMod.Item] = js.undefined
  
  /**
    * The reason why the panel state has changed, for example, items have been added, removed, or moved.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object ItemReason {
  
  inline def apply(): ItemReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemReason] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMP13nBasePanelMod.Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
