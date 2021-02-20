package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragDrop extends StObject {
  
  var drag: js.UndefOr[ItemsDragStart] = js.native
  
  var drop: js.UndefOr[ItemsDragOver] = js.native
  
  var reorder: `14` = js.native
}
object DragDrop {
  
  @scala.inline
  def apply(reorder: `14`): DragDrop = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDrop]
  }
  
  @scala.inline
  implicit class DragDropMutableBuilder[Self <: DragDrop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrag(value: ItemsDragStart): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDrop(value: ItemsDragOver): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setReorder(value: `14`): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
  }
}
