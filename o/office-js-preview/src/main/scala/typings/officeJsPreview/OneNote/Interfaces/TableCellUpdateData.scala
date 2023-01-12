package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableCell object, for use in `tableCell.set({ ... })`. */
trait TableCellUpdateData extends StObject {
  
  /**
    * Gets and sets the shading color of the cell
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[String] = js.undefined
}
object TableCellUpdateData {
  
  inline def apply(): TableCellUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCellUpdateData] (val x: Self) extends AnyVal {
    
    inline def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
  }
}
