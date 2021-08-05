package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the visual layout of the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
trait PivotLayoutLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if formatting will be automatically formatted when it’s refreshed or when fields are moved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the field list can be shown in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var enableFieldList: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * [Api set: ExcelApi 1.9]
    */
  var preserveFormatting: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the PivotTable report shows grand totals for columns.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the PivotTable report shows grand totals for rows.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: js.UndefOr[Boolean] = js.undefined
}
object PivotLayoutLoadOptions {
  
  inline def apply(): PivotLayoutLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotLayoutLoadOptions]
  }
  
  extension [Self <: PivotLayoutLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAutoFormat(value: Boolean): Self = StObject.set(x, "autoFormat", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatUndefined: Self = StObject.set(x, "autoFormat", js.undefined)
    
    inline def setEnableFieldList(value: Boolean): Self = StObject.set(x, "enableFieldList", value.asInstanceOf[js.Any])
    
    inline def setEnableFieldListUndefined: Self = StObject.set(x, "enableFieldList", js.undefined)
    
    inline def setLayoutType(value: Boolean): Self = StObject.set(x, "layoutType", value.asInstanceOf[js.Any])
    
    inline def setLayoutTypeUndefined: Self = StObject.set(x, "layoutType", js.undefined)
    
    inline def setPreserveFormatting(value: Boolean): Self = StObject.set(x, "preserveFormatting", value.asInstanceOf[js.Any])
    
    inline def setPreserveFormattingUndefined: Self = StObject.set(x, "preserveFormatting", js.undefined)
    
    inline def setShowColumnGrandTotals(value: Boolean): Self = StObject.set(x, "showColumnGrandTotals", value.asInstanceOf[js.Any])
    
    inline def setShowColumnGrandTotalsUndefined: Self = StObject.set(x, "showColumnGrandTotals", js.undefined)
    
    inline def setShowRowGrandTotals(value: Boolean): Self = StObject.set(x, "showRowGrandTotals", value.asInstanceOf[js.Any])
    
    inline def setShowRowGrandTotalsUndefined: Self = StObject.set(x, "showRowGrandTotals", js.undefined)
    
    inline def setSubtotalLocation(value: Boolean): Self = StObject.set(x, "subtotalLocation", value.asInstanceOf[js.Any])
    
    inline def setSubtotalLocationUndefined: Self = StObject.set(x, "subtotalLocation", js.undefined)
  }
}
