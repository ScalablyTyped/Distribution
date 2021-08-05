package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.SlicerSortType
import typings.officeJsPreview.officeJsPreviewStrings.Ascending
import typings.officeJsPreview.officeJsPreviewStrings.DataSourceOrder
import typings.officeJsPreview.officeJsPreviewStrings.Descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicer.toJSON()`. */
trait SlicerData extends StObject {
  
  /**
    *
    * Represents the caption of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the height, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the unique id of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * True if all filters currently applied on the slicer are cleared.
    *
    * [Api set: ExcelApi 1.10]
    */
  var isFilterCleared: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the distance, in points, from the left side of the slicer to the left of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the name of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the slicer name used in the formula.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var nameInFormula: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the collection of SlicerItems that are part of the slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var slicerItems: js.UndefOr[js.Array[SlicerItemData]] = js.undefined
  
  /**
    *
    * The style applied to the Slicer.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var slicerStyle: js.UndefOr[SlicerStyleData] = js.undefined
  
  /**
    *
    * Represents the sort order of the items in the slicer. Possible values are: "DataSourceOrder", "Ascending", "Descending".
    *
    * [Api set: ExcelApi 1.10]
    */
  var sortBy: js.UndefOr[SlicerSortType | DataSourceOrder | Ascending | Descending] = js.undefined
  
  /**
    *
    * Constant value that represents the Slicer style. Possible values are: "SlicerStyleLight1" through "SlicerStyleLight6", "TableStyleOther1" through "TableStyleOther2", "SlicerStyleDark1" through "SlicerStyleDark6". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.10]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the distance, in points, from the top edge of the slicer to the top of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the width, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the worksheet containing the slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheet: js.UndefOr[WorksheetData] = js.undefined
}
object SlicerData {
  
  inline def apply(): SlicerData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerData]
  }
  
  extension [Self <: SlicerData](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsFilterCleared(value: Boolean): Self = StObject.set(x, "isFilterCleared", value.asInstanceOf[js.Any])
    
    inline def setIsFilterClearedUndefined: Self = StObject.set(x, "isFilterCleared", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameInFormula(value: String): Self = StObject.set(x, "nameInFormula", value.asInstanceOf[js.Any])
    
    inline def setNameInFormulaUndefined: Self = StObject.set(x, "nameInFormula", js.undefined)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSlicerItems(value: js.Array[SlicerItemData]): Self = StObject.set(x, "slicerItems", value.asInstanceOf[js.Any])
    
    inline def setSlicerItemsUndefined: Self = StObject.set(x, "slicerItems", js.undefined)
    
    inline def setSlicerItemsVarargs(value: SlicerItemData*): Self = StObject.set(x, "slicerItems", js.Array(value :_*))
    
    inline def setSlicerStyle(value: SlicerStyleData): Self = StObject.set(x, "slicerStyle", value.asInstanceOf[js.Any])
    
    inline def setSlicerStyleUndefined: Self = StObject.set(x, "slicerStyle", js.undefined)
    
    inline def setSortBy(value: SlicerSortType | DataSourceOrder | Ascending | Descending): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWorksheet(value: WorksheetData): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
