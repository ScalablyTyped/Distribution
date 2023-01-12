package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pageBreak.toJSON()`. */
trait PageBreakData extends StObject {
  
  /**
    * Specifies the column index for the page break.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the row index for the page break.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object PageBreakData {
  
  inline def apply(): PageBreakData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageBreakData] (val x: Self) extends AnyVal {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
