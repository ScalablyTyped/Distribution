package typings.openui5.anon

import typings.openui5.sapMLibraryMod.SelectionDetailsActionLevel
import typings.openui5.sapUiCoreItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  /**
    * The action that has to be processed once the action has been pressed
    */
  var action: js.UndefOr[default] = js.undefined
  
  /**
    * If the action is pressed on one of the {@link sap.m.SelectionDetailsItem items}, the parameter contains
    * a reference to the pressed {@link sap.m.SelectionDetailsItem item}. If a custom action or action group
    * of the SelectionDetails popover is pressed, this parameter refers to all {@link sap.m.SelectionDetailsItem
    * items}
    */
  var items: js.UndefOr[typings.openui5.sapMSelectionDetailsItemMod.default] = js.undefined
  
  /**
    * The action level of action buttons. The available levels are Item, List and Group
    */
  var level: js.UndefOr[
    SelectionDetailsActionLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionDetailsActionLevel * / any */ String)
  ] = js.undefined
}
object Level {
  
  inline def apply(): Level = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    inline def setAction(value: default): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setItems(value: typings.openui5.sapMSelectionDetailsItemMod.default): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setLevel(
      value: SelectionDetailsActionLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionDetailsActionLevel * / any */ String)
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
