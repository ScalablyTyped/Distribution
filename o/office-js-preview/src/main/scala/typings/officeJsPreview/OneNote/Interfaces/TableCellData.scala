package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableCell.toJSON()`. */
trait TableCellData extends StObject {
  
  /**
    * Gets the index of the cell in its row. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the ID of the cell. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the collection of Paragraph objects in the TableCell. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  
  /**
    * Gets the index of the cell's row in the table. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets and sets the shading color of the cell
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[String] = js.undefined
}
object TableCellData {
  
  inline def apply(): TableCellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCellData] (val x: Self) extends AnyVal {
    
    inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParagraphs(value: js.Array[ParagraphData]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    inline def setParagraphsVarargs(value: ParagraphData*): Self = StObject.set(x, "paragraphs", js.Array(value*))
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
  }
}
