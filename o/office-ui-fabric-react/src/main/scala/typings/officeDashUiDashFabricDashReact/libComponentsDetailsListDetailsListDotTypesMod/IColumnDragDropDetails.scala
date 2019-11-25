package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDragDropDetails extends js.Object {
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
}

