package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDrop extends StObject {
  
  var drag: js.UndefOr[ItemsDragStart] = js.undefined
  
  var drop: js.UndefOr[ItemsDragOver] = js.undefined
  
  var reorder: `14`
}
object DragDrop {
  
  inline def apply(reorder: `14`): DragDrop = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDrop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragDrop] (val x: Self) extends AnyVal {
    
    inline def setDrag(value: ItemsDragStart): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDrop(value: ItemsDragOver): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setReorder(value: `14`): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
  }
}
