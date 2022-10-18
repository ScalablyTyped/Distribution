package typings.openui5.anon

import typings.openui5.sapFSidePanelItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expanded extends StObject {
  
  /**
    * State of the action item.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The action item that triggers the event.
    */
  var item: js.UndefOr[default] = js.undefined
}
object Expanded {
  
  inline def apply(): Expanded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expanded]
  }
  
  extension [Self <: Expanded](x: Self) {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
