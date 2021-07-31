package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.9]
  */
trait PageBreakCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the column index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the row index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
}
object PageBreakCollectionLoadOptions {
  
  @scala.inline
  def apply(): PageBreakCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class PageBreakCollectionLoadOptionsMutableBuilder[Self <: PageBreakCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Boolean): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Boolean): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
