package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.PivotLayoutType
import typings.officeJsPreview.Excel.SubtotalLocationType
import typings.officeJsPreview.officeJsPreviewStrings.AtBottom
import typings.officeJsPreview.officeJsPreviewStrings.AtTop
import typings.officeJsPreview.officeJsPreviewStrings.Compact
import typings.officeJsPreview.officeJsPreviewStrings.Off
import typings.officeJsPreview.officeJsPreviewStrings.Outline
import typings.officeJsPreview.officeJsPreviewStrings.Tabular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotLayout object, for use in `pivotLayout.set({ ... })`. */
trait PivotLayoutUpdateData extends StObject {
  
  /**
    *
    * The alt text description of the PivotTable.
    
    Alt text provides alternative, text-based representations of the information contained in the PivotTable.
    This information is useful for people with vision or cognitive impairments who may not be able to see or understand the table.
    A title can be read to a person with a disability and is used to determine whether they wish to hear the description of the content.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextDescription: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The alt text title of the PivotTable.
    
    Alt text provides alternative, text-based representations of the information contained in the PivotTable.
    This information is useful for people with vision or cognitive impairments who may not be able to see or understand the table.
    A title can be read to a person with a disability and is used to determine whether they wish to hear the description of the content.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextTitle: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies if formatting will be automatically formatted when it’s refreshed or when fields are moved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The text that is automatically filled into any empty cell in the PivotTable if `fillEmptyCells == true`.
    Note that this value persists if `fillEmptyCells` is set to false, and that setting this value does not set that property to true.
    By default, this is an empty string.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var emptyCellText: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies if the field list can be shown in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var enableFieldList: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether empty cells in the PivotTable should be populated with the `emptyCellText`. False by default.
    Note that the value of `emptyCellText` persists when this property is set to false.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var fillEmptyCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[PivotLayoutType | Compact | Tabular | Outline] = js.undefined
  
  /**
    *
    * The style applied to the PivotTable.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var pivotStyle: js.UndefOr[PivotTableStyleUpdateData] = js.undefined
  
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
    * Specifies whether the PivotTable displays field headers (field captions and filter drop-downs).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showFieldHeaders: js.UndefOr[Boolean] = js.undefined
  
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
  var subtotalLocation: js.UndefOr[SubtotalLocationType | AtTop | AtBottom | Off] = js.undefined
}
object PivotLayoutUpdateData {
  
  @scala.inline
  def apply(): PivotLayoutUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotLayoutUpdateData]
  }
  
  @scala.inline
  implicit class PivotLayoutUpdateDataMutableBuilder[Self <: PivotLayoutUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltTextDescription(value: String): Self = StObject.set(x, "altTextDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextDescriptionUndefined: Self = StObject.set(x, "altTextDescription", js.undefined)
    
    @scala.inline
    def setAltTextTitle(value: String): Self = StObject.set(x, "altTextTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextTitleUndefined: Self = StObject.set(x, "altTextTitle", js.undefined)
    
    @scala.inline
    def setAutoFormat(value: Boolean): Self = StObject.set(x, "autoFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFormatUndefined: Self = StObject.set(x, "autoFormat", js.undefined)
    
    @scala.inline
    def setEmptyCellText(value: String): Self = StObject.set(x, "emptyCellText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyCellTextUndefined: Self = StObject.set(x, "emptyCellText", js.undefined)
    
    @scala.inline
    def setEnableFieldList(value: Boolean): Self = StObject.set(x, "enableFieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFieldListUndefined: Self = StObject.set(x, "enableFieldList", js.undefined)
    
    @scala.inline
    def setFillEmptyCells(value: Boolean): Self = StObject.set(x, "fillEmptyCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillEmptyCellsUndefined: Self = StObject.set(x, "fillEmptyCells", js.undefined)
    
    @scala.inline
    def setLayoutType(value: PivotLayoutType | Compact | Tabular | Outline): Self = StObject.set(x, "layoutType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutTypeUndefined: Self = StObject.set(x, "layoutType", js.undefined)
    
    @scala.inline
    def setPivotStyle(value: PivotTableStyleUpdateData): Self = StObject.set(x, "pivotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotStyleUndefined: Self = StObject.set(x, "pivotStyle", js.undefined)
    
    @scala.inline
    def setPreserveFormatting(value: Boolean): Self = StObject.set(x, "preserveFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveFormattingUndefined: Self = StObject.set(x, "preserveFormatting", js.undefined)
    
    @scala.inline
    def setShowColumnGrandTotals(value: Boolean): Self = StObject.set(x, "showColumnGrandTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColumnGrandTotalsUndefined: Self = StObject.set(x, "showColumnGrandTotals", js.undefined)
    
    @scala.inline
    def setShowFieldHeaders(value: Boolean): Self = StObject.set(x, "showFieldHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFieldHeadersUndefined: Self = StObject.set(x, "showFieldHeaders", js.undefined)
    
    @scala.inline
    def setShowRowGrandTotals(value: Boolean): Self = StObject.set(x, "showRowGrandTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRowGrandTotalsUndefined: Self = StObject.set(x, "showRowGrandTotals", js.undefined)
    
    @scala.inline
    def setSubtotalLocation(value: SubtotalLocationType | AtTop | AtBottom | Off): Self = StObject.set(x, "subtotalLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotalLocationUndefined: Self = StObject.set(x, "subtotalLocation", js.undefined)
  }
}
