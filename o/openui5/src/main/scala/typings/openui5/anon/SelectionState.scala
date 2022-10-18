package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionState extends StObject {
  
  /**
    * Checks whether the box is flagged or not flagged.
    */
  var selectionState: js.UndefOr[String] = js.undefined
}
object SelectionState {
  
  inline def apply(): SelectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionState]
  }
  
  extension [Self <: SelectionState](x: Self) {
    
    inline def setSelectionState(value: String): Self = StObject.set(x, "selectionState", value.asInstanceOf[js.Any])
    
    inline def setSelectionStateUndefined: Self = StObject.set(x, "selectionState", js.undefined)
  }
}
