package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pageBreak.toJSON()`. */
trait PageBreakData extends StObject {
  
  /**
    *
    * Specifies the column index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the row index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object PageBreakData {
  
  @scala.inline
  def apply(): PageBreakData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakData]
  }
  
  @scala.inline
  implicit class PageBreakDataMutableBuilder[Self <: PageBreakData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
