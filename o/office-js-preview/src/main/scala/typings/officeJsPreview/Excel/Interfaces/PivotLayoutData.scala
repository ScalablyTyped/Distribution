package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.PivotLayoutType
import typings.officeJsPreview.Excel.SubtotalLocationType
import typings.officeJsPreview.officeJsPreviewStrings.AtBottom
import typings.officeJsPreview.officeJsPreviewStrings.AtTop
import typings.officeJsPreview.officeJsPreviewStrings.Compact
import typings.officeJsPreview.officeJsPreviewStrings.Off
import typings.officeJsPreview.officeJsPreviewStrings.Outline
import typings.officeJsPreview.officeJsPreviewStrings.Tabular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotLayout.toJSON()`. */
@js.native
trait PivotLayoutData extends js.Object {
  
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
  var altTextDescription: js.UndefOr[String] = js.native
  
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
  var altTextTitle: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies if formatting will be automatically formatted when it’s refreshed or when fields are moved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The text that is automatically filled into any empty cell in the PivotTable if `fillEmptyCells == true`.
    Note that this value persists if `fillEmptyCells` is set to false, and that setting this value does not set that property to true.
    By default, this is an empty string.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var emptyCellText: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies if the field list can be shown in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var enableFieldList: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether empty cells in the PivotTable should be populated with the `emptyCellText`. False by default.
    Note that the value of `emptyCellText` persists when this property is set to false.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var fillEmptyCells: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[PivotLayoutType | Compact | Tabular | Outline] = js.native
  
  /**
    *
    * The style applied to the PivotTable.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var pivotStyle: js.UndefOr[PivotTableStyleData] = js.native
  
  /**
    *
    * Specifies if formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * [Api set: ExcelApi 1.9]
    */
  var preserveFormatting: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the PivotTable report shows grand totals for columns.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether the PivotTable displays field headers (field captions and filter drop-downs).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showFieldHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the PivotTable report shows grand totals for rows.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: js.UndefOr[SubtotalLocationType | AtTop | AtBottom | Off] = js.native
}
object PivotLayoutData {
  
  @scala.inline
  def apply(): PivotLayoutData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotLayoutData]
  }
  
  @scala.inline
  implicit class PivotLayoutDataOps[Self <: PivotLayoutData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAltTextDescription(value: String): Self = this.set("altTextDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltTextDescription: Self = this.set("altTextDescription", js.undefined)
    
    @scala.inline
    def setAltTextTitle(value: String): Self = this.set("altTextTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltTextTitle: Self = this.set("altTextTitle", js.undefined)
    
    @scala.inline
    def setAutoFormat(value: Boolean): Self = this.set("autoFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFormat: Self = this.set("autoFormat", js.undefined)
    
    @scala.inline
    def setEmptyCellText(value: String): Self = this.set("emptyCellText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyCellText: Self = this.set("emptyCellText", js.undefined)
    
    @scala.inline
    def setEnableFieldList(value: Boolean): Self = this.set("enableFieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFieldList: Self = this.set("enableFieldList", js.undefined)
    
    @scala.inline
    def setFillEmptyCells(value: Boolean): Self = this.set("fillEmptyCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillEmptyCells: Self = this.set("fillEmptyCells", js.undefined)
    
    @scala.inline
    def setLayoutType(value: PivotLayoutType | Compact | Tabular | Outline): Self = this.set("layoutType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutType: Self = this.set("layoutType", js.undefined)
    
    @scala.inline
    def setPivotStyle(value: PivotTableStyleData): Self = this.set("pivotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotStyle: Self = this.set("pivotStyle", js.undefined)
    
    @scala.inline
    def setPreserveFormatting(value: Boolean): Self = this.set("preserveFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveFormatting: Self = this.set("preserveFormatting", js.undefined)
    
    @scala.inline
    def setShowColumnGrandTotals(value: Boolean): Self = this.set("showColumnGrandTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnGrandTotals: Self = this.set("showColumnGrandTotals", js.undefined)
    
    @scala.inline
    def setShowFieldHeaders(value: Boolean): Self = this.set("showFieldHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFieldHeaders: Self = this.set("showFieldHeaders", js.undefined)
    
    @scala.inline
    def setShowRowGrandTotals(value: Boolean): Self = this.set("showRowGrandTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowGrandTotals: Self = this.set("showRowGrandTotals", js.undefined)
    
    @scala.inline
    def setSubtotalLocation(value: SubtotalLocationType | AtTop | AtBottom | Off): Self = this.set("subtotalLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtotalLocation: Self = this.set("subtotalLocation", js.undefined)
  }
}
