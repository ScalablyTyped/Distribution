package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains the collection of cross-worksheets level Ranges.
  *
  * [Api set: ExcelApi 1.12]
  */
trait RangeAreasCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the RangeAreas reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4").
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the RangeAreas reference in the user locale.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the number of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var areaCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the number of cells in the RangeAreas object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * [Api set: ExcelApi 1.9]
    */
  var cellCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns a RangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if all the ranges on this RangeAreas object represent entire columns (e.g., "A:C, Q:Z").
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if all the ranges on this RangeAreas object represent entire rows (e.g., "1:3, 5:7").
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents the style for all ranges in this RangeAreas object.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the worksheet for the current RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}
object RangeAreasCollectionLoadOptions {
  
  @scala.inline
  def apply(): RangeAreasCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeAreasCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class RangeAreasCollectionLoadOptionsMutableBuilder[Self <: RangeAreasCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAddress(value: Boolean): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocal(value: Boolean): Self = StObject.set(x, "addressLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocalUndefined: Self = StObject.set(x, "addressLocal", js.undefined)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAreaCount(value: Boolean): Self = StObject.set(x, "areaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaCountUndefined: Self = StObject.set(x, "areaCount", js.undefined)
    
    @scala.inline
    def setCellCount(value: Boolean): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellCountUndefined: Self = StObject.set(x, "cellCount", js.undefined)
    
    @scala.inline
    def setDataValidation(value: DataValidationLoadOptions): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
    
    @scala.inline
    def setFormat(value: RangeFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIsEntireColumn(value: Boolean): Self = StObject.set(x, "isEntireColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEntireColumnUndefined: Self = StObject.set(x, "isEntireColumn", js.undefined)
    
    @scala.inline
    def setIsEntireRow(value: Boolean): Self = StObject.set(x, "isEntireRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEntireRowUndefined: Self = StObject.set(x, "isEntireRow", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWorksheet(value: WorksheetLoadOptions): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
