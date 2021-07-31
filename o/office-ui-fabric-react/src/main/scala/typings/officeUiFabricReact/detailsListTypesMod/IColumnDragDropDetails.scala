package typings.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnDragDropDetails extends StObject {
  
  /**
    * Specifies the source column index
    * @defaultvalue -1
    */
  var draggedIndex: Double
  
  /**
    * Specifies the target column index
    * @defaultvalue -1
    */
  var targetIndex: Double
}
object IColumnDragDropDetails {
  
  @scala.inline
  def apply(draggedIndex: Double, targetIndex: Double): IColumnDragDropDetails = {
    val __obj = js.Dynamic.literal(draggedIndex = draggedIndex.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDragDropDetails]
  }
  
  @scala.inline
  implicit class IColumnDragDropDetailsMutableBuilder[Self <: IColumnDragDropDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggedIndex(value: Double): Self = StObject.set(x, "draggedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIndex(value: Double): Self = StObject.set(x, "targetIndex", value.asInstanceOf[js.Any])
  }
}
