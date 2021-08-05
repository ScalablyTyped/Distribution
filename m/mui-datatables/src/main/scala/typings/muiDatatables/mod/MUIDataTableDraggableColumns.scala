package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableDraggableColumns extends StObject {
  
  var enabled: Boolean
  
  var transitionTime: js.UndefOr[Double] = js.undefined
}
object MUIDataTableDraggableColumns {
  
  inline def apply(enabled: Boolean): MUIDataTableDraggableColumns = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableDraggableColumns]
  }
  
  extension [Self <: MUIDataTableDraggableColumns](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setTransitionTime(value: Double): Self = StObject.set(x, "transitionTime", value.asInstanceOf[js.Any])
    
    inline def setTransitionTimeUndefined: Self = StObject.set(x, "transitionTime", js.undefined)
  }
}
