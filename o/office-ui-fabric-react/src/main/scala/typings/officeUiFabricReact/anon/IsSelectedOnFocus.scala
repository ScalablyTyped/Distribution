package typings.officeUiFabricReact.anon

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSelectedOnFocus extends StObject {
  
  var isSelectedOnFocus: Boolean
  
  var selectionClearedOnEscapePress: Boolean
  
  var selectionMode: SelectionMode
  
  var toggleWithoutModifierPressed: Boolean
}
object IsSelectedOnFocus {
  
  inline def apply(
    isSelectedOnFocus: Boolean,
    selectionClearedOnEscapePress: Boolean,
    selectionMode: SelectionMode,
    toggleWithoutModifierPressed: Boolean
  ): IsSelectedOnFocus = {
    val __obj = js.Dynamic.literal(isSelectedOnFocus = isSelectedOnFocus.asInstanceOf[js.Any], selectionClearedOnEscapePress = selectionClearedOnEscapePress.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], toggleWithoutModifierPressed = toggleWithoutModifierPressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSelectedOnFocus]
  }
  
  extension [Self <: IsSelectedOnFocus](x: Self) {
    
    inline def setIsSelectedOnFocus(value: Boolean): Self = StObject.set(x, "isSelectedOnFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionClearedOnEscapePress(value: Boolean): Self = StObject.set(x, "selectionClearedOnEscapePress", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setToggleWithoutModifierPressed(value: Boolean): Self = StObject.set(x, "toggleWithoutModifierPressed", value.asInstanceOf[js.Any])
  }
}
