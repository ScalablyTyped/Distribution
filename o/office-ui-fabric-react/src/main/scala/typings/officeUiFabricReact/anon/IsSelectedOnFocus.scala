package typings.officeUiFabricReact.anon

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSelectedOnFocus extends StObject {
  
  var isSelectedOnFocus: Boolean
  
  var selectionMode: SelectionMode
}
object IsSelectedOnFocus {
  
  inline def apply(isSelectedOnFocus: Boolean, selectionMode: SelectionMode): IsSelectedOnFocus = {
    val __obj = js.Dynamic.literal(isSelectedOnFocus = isSelectedOnFocus.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSelectedOnFocus]
  }
  
  extension [Self <: IsSelectedOnFocus](x: Self) {
    
    inline def setIsSelectedOnFocus(value: Boolean): Self = StObject.set(x, "isSelectedOnFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
  }
}
