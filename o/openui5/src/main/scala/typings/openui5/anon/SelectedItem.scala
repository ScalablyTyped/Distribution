package typings.openui5.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItem extends StObject {
  
  /**
    * the pressed item.
    */
  var selectedItem: js.UndefOr[HTMLElement] = js.undefined
}
object SelectedItem {
  
  inline def apply(): SelectedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItem]
  }
  
  extension [Self <: SelectedItem](x: Self) {
    
    inline def setSelectedItem(value: HTMLElement): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
  }
}
