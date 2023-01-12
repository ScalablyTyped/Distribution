package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.PivotLayoutType
import typings.officeJs.Excel.SubtotalLocationType
import typings.officeJs.officeJsStrings.AtBottom
import typings.officeJs.officeJsStrings.AtTop
import typings.officeJs.officeJsStrings.Compact
import typings.officeJs.officeJsStrings.Off
import typings.officeJs.officeJsStrings.Outline
import typings.officeJs.officeJsStrings.Tabular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotLayout.toJSON()`. */
trait PivotLayoutData extends StObject {
  
  /**
    * The alt text description of the PivotTable.
    
    Alt text provides alternative, text-based representations of the information contained in the PivotTable.
    This information is useful for people with vision or cognitive impairments who may not be able to see or understand the table.
    A title can be read to a person with a disability and is used to determine whether they wish to hear the description of the content.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var altTextDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The alt text title of the PivotTable.
    
    Alt text provides alternative, text-based representations of the information contained in the PivotTable.
    This information is useful for people with vision or cognitive impairments who may not be able to see or understand the table.
    A title can be read to a person with a disability and is used to determine whether they wish to hear the description of the content.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var altTextTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if formatting will be automatically formatted when it’s refreshed or when fields are moved.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text that is automatically filled into any empty cell in the PivotTable if `fillEmptyCells == true`.
    Note that this value persists if `fillEmptyCells` is set to `false`, and that setting this value does not set that property to `true`.
    By default, this is an empty string.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var emptyCellText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the field list can be shown in the UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var enableFieldList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether empty cells in the PivotTable should be populated with the `emptyCellText`. Default is `false`.
    Note that the value of `emptyCellText` persists when this property is set to `false`.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var fillEmptyCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[PivotLayoutType | Compact | Tabular | Outline] = js.undefined
  
  /**
    * Specifies if formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var preserveFormatting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the PivotTable report shows grand totals for columns.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the PivotTable displays field headers (field captions and filter drop-downs).
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var showFieldHeaders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the PivotTable report shows grand totals for rows.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property indicates the `SubtotalLocationType` of all fields on the PivotTable. If fields have different states, this will be `null`.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: js.UndefOr[SubtotalLocationType | AtTop | AtBottom | Off] = js.undefined
}
object PivotLayoutData {
  
  inline def apply(): PivotLayoutData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotLayoutData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotLayoutData] (val x: Self) extends AnyVal {
    
    inline def setAltTextDescription(value: String): Self = StObject.set(x, "altTextDescription", value.asInstanceOf[js.Any])
    
    inline def setAltTextDescriptionUndefined: Self = StObject.set(x, "altTextDescription", js.undefined)
    
    inline def setAltTextTitle(value: String): Self = StObject.set(x, "altTextTitle", value.asInstanceOf[js.Any])
    
    inline def setAltTextTitleUndefined: Self = StObject.set(x, "altTextTitle", js.undefined)
    
    inline def setAutoFormat(value: Boolean): Self = StObject.set(x, "autoFormat", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatUndefined: Self = StObject.set(x, "autoFormat", js.undefined)
    
    inline def setEmptyCellText(value: String): Self = StObject.set(x, "emptyCellText", value.asInstanceOf[js.Any])
    
    inline def setEmptyCellTextUndefined: Self = StObject.set(x, "emptyCellText", js.undefined)
    
    inline def setEnableFieldList(value: Boolean): Self = StObject.set(x, "enableFieldList", value.asInstanceOf[js.Any])
    
    inline def setEnableFieldListUndefined: Self = StObject.set(x, "enableFieldList", js.undefined)
    
    inline def setFillEmptyCells(value: Boolean): Self = StObject.set(x, "fillEmptyCells", value.asInstanceOf[js.Any])
    
    inline def setFillEmptyCellsUndefined: Self = StObject.set(x, "fillEmptyCells", js.undefined)
    
    inline def setLayoutType(value: PivotLayoutType | Compact | Tabular | Outline): Self = StObject.set(x, "layoutType", value.asInstanceOf[js.Any])
    
    inline def setLayoutTypeUndefined: Self = StObject.set(x, "layoutType", js.undefined)
    
    inline def setPreserveFormatting(value: Boolean): Self = StObject.set(x, "preserveFormatting", value.asInstanceOf[js.Any])
    
    inline def setPreserveFormattingUndefined: Self = StObject.set(x, "preserveFormatting", js.undefined)
    
    inline def setShowColumnGrandTotals(value: Boolean): Self = StObject.set(x, "showColumnGrandTotals", value.asInstanceOf[js.Any])
    
    inline def setShowColumnGrandTotalsUndefined: Self = StObject.set(x, "showColumnGrandTotals", js.undefined)
    
    inline def setShowFieldHeaders(value: Boolean): Self = StObject.set(x, "showFieldHeaders", value.asInstanceOf[js.Any])
    
    inline def setShowFieldHeadersUndefined: Self = StObject.set(x, "showFieldHeaders", js.undefined)
    
    inline def setShowRowGrandTotals(value: Boolean): Self = StObject.set(x, "showRowGrandTotals", value.asInstanceOf[js.Any])
    
    inline def setShowRowGrandTotalsUndefined: Self = StObject.set(x, "showRowGrandTotals", js.undefined)
    
    inline def setSubtotalLocation(value: SubtotalLocationType | AtTop | AtBottom | Off): Self = StObject.set(x, "subtotalLocation", value.asInstanceOf[js.Any])
    
    inline def setSubtotalLocationUndefined: Self = StObject.set(x, "subtotalLocation", js.undefined)
  }
}
