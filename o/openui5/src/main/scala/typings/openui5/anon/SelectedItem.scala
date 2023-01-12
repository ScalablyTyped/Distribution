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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedItem] (val x: Self) extends AnyVal {
    
    inline def setSelectedItem(value: HTMLElement): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
  }
}
