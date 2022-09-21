package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetProperties extends StObject {
  
  /** Output only. If present, the field contains DATA_SOURCE sheet specific properties. */
  var dataSourceSheetProperties: js.UndefOr[DataSourceSheetProperties] = js.undefined
  
  /**
    * Additional properties of the sheet if this sheet is a grid. (If the sheet is an object sheet, containing a chart or image, then this field will be absent.) When writing it is an
    * error to set any grid properties on non-grid sheets. If this sheet is a DATA_SOURCE sheet, this field is output only but contains the properties that reflect how a data source sheet
    * is rendered in the UI, e.g. row_count.
    */
  var gridProperties: js.UndefOr[GridProperties] = js.undefined
  
  /** True if the sheet is hidden in the UI, false if it's visible. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The index of the sheet within the spreadsheet. When adding or updating sheet properties, if this field is excluded then the sheet is added or moved to the end of the sheet list.
    * When updating sheet indices or inserting sheets, movement is considered in "before the move" indexes. For example, if there were 3 sheets (S1, S2, S3) in order to move S1 ahead of
    * S2 the index would have to be set to 2. A sheet index update request is ignored if the requested index is identical to the sheets current index or if the requested new index is
    * equal to the current sheet index + 1.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /** True if the sheet is an RTL sheet instead of an LTR sheet. */
  var rightToLeft: js.UndefOr[Boolean] = js.undefined
  
  /** The ID of the sheet. Must be non-negative. This field cannot be changed once set. */
  var sheetId: js.UndefOr[Double] = js.undefined
  
  /** The type of sheet. Defaults to GRID. This field cannot be changed once set. */
  var sheetType: js.UndefOr[String] = js.undefined
  
  /** The color of the tab in the UI. Deprecated: Use tab_color_style. */
  var tabColor: js.UndefOr[Color] = js.undefined
  
  /** The color of the tab in the UI. If tab_color is also set, this field takes precedence. */
  var tabColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The name of the sheet. */
  var title: js.UndefOr[String] = js.undefined
}
object SheetProperties {
  
  inline def apply(): SheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetProperties]
  }
  
  extension [Self <: SheetProperties](x: Self) {
    
    inline def setDataSourceSheetProperties(value: DataSourceSheetProperties): Self = StObject.set(x, "dataSourceSheetProperties", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSheetPropertiesUndefined: Self = StObject.set(x, "dataSourceSheetProperties", js.undefined)
    
    inline def setGridProperties(value: GridProperties): Self = StObject.set(x, "gridProperties", value.asInstanceOf[js.Any])
    
    inline def setGridPropertiesUndefined: Self = StObject.set(x, "gridProperties", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setRightToLeft(value: Boolean): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    inline def setRightToLeftUndefined: Self = StObject.set(x, "rightToLeft", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setSheetType(value: String): Self = StObject.set(x, "sheetType", value.asInstanceOf[js.Any])
    
    inline def setSheetTypeUndefined: Self = StObject.set(x, "sheetType", js.undefined)
    
    inline def setTabColor(value: Color): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
    
    inline def setTabColorStyle(value: ColorStyle): Self = StObject.set(x, "tabColorStyle", value.asInstanceOf[js.Any])
    
    inline def setTabColorStyleUndefined: Self = StObject.set(x, "tabColorStyle", js.undefined)
    
    inline def setTabColorUndefined: Self = StObject.set(x, "tabColor", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
