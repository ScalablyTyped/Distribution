package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  /**
    * The content of the currently viewed page that was previously added via {@link sap.m.SelectionDetailsFacade#navTo}.
    * This contains the content of the page before the navigation was triggered. Can be null in case of first
    * event triggering.
    */
  var content: js.UndefOr[default] = js.undefined
  
  /**
    * Direction of the triggered navigation, possible values are "to" and "back".
    */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * The item on which the action has been pressed. Can be null in case a navigation was done without item
    * context, e.g. action press.
    */
  var item: js.UndefOr[typings.openui5.sapMSelectionDetailsItemMod.default] = js.undefined
}
object Content {
  
  inline def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setItem(value: typings.openui5.sapMSelectionDetailsItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
