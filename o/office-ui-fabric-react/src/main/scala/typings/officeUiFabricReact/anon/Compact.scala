package typings.officeUiFabricReact.anon

import typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compact extends StObject {
  
  var compact: Boolean
  
  var isHeaderVisible: Boolean
  
  var selectionMode: SelectionMode
}
object Compact {
  
  inline def apply(compact: Boolean, isHeaderVisible: Boolean, selectionMode: SelectionMode): Compact = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compact]
  }
  
  extension [Self <: Compact](x: Self) {
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setIsHeaderVisible(value: Boolean): Self = StObject.set(x, "isHeaderVisible", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
  }
}
