package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableCell object, for use in "tableCell.set({ ... })". */
@js.native
trait TableCellUpdateData extends StObject {
  
  /**
    *
    * Gets and sets the shading color of the cell
    *
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[String] = js.native
}
object TableCellUpdateData {
  
  @scala.inline
  def apply(): TableCellUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellUpdateData]
  }
  
  @scala.inline
  implicit class TableCellUpdateDataMutableBuilder[Self <: TableCellUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
  }
}
