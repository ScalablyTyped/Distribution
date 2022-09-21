package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Workbook is the top level object which contains related workbook objects such as worksheets, tables, and ranges.
  To learn more about the workbook object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-workbooks | Work with workbooks using the Excel JavaScript API}.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait WorkbookLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the Excel application instance that contains this workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var application: js.UndefOr[ApplicationLoadOptions] = js.undefined
  
  /**
    * Specifies if the workbook is in AutoSave mode.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var autoSave: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents a collection of bindings that are part of the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var bindings: js.UndefOr[BindingCollectionLoadOptions] = js.undefined
  
  /**
    * Returns a number about the version of Excel Calculation Engine.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if changes have been made since the workbook was last saved.
    You can set this property to `true` if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns a collection of linked workbooks. In formulas, the workbook links can be used to reference data (cell values and names) outside of the current workbook.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var linkedWorkbooks: js.UndefOr[LinkedWorkbookCollectionLoadOptions] = js.undefined
  
  /**
    * Gets the workbook name.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the workbook has ever been saved locally or online.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var previouslySaved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the workbook properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesLoadOptions] = js.undefined
  
  /**
    * Returns the protection object for a workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var protection: js.UndefOr[WorkbookProtectionLoadOptions] = js.undefined
  
  /**
    * Returns `true` if the workbook is open in read-only mode.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the PivotTable's field list pane is shown at the workbook level.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showPivotFieldList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents a collection of tables associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.undefined
  
  /**
    * True if the workbook uses the 1904 date system.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var use1904DateSystem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from `false` to `true`.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined
}
object WorkbookLoadOptions {
  
  inline def apply(): WorkbookLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookLoadOptions]
  }
  
  extension [Self <: WorkbookLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setApplication(value: ApplicationLoadOptions): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setBindings(value: BindingCollectionLoadOptions): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setCalculationEngineVersion(value: Boolean): Self = StObject.set(x, "calculationEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setCalculationEngineVersionUndefined: Self = StObject.set(x, "calculationEngineVersion", js.undefined)
    
    inline def setChartDataPointTrack(value: Boolean): Self = StObject.set(x, "chartDataPointTrack", value.asInstanceOf[js.Any])
    
    inline def setChartDataPointTrackUndefined: Self = StObject.set(x, "chartDataPointTrack", js.undefined)
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    inline def setLinkedWorkbooks(value: LinkedWorkbookCollectionLoadOptions): Self = StObject.set(x, "linkedWorkbooks", value.asInstanceOf[js.Any])
    
    inline def setLinkedWorkbooksUndefined: Self = StObject.set(x, "linkedWorkbooks", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreviouslySaved(value: Boolean): Self = StObject.set(x, "previouslySaved", value.asInstanceOf[js.Any])
    
    inline def setPreviouslySavedUndefined: Self = StObject.set(x, "previouslySaved", js.undefined)
    
    inline def setProperties(value: DocumentPropertiesLoadOptions): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setProtection(value: WorkbookProtectionLoadOptions): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setShowPivotFieldList(value: Boolean): Self = StObject.set(x, "showPivotFieldList", value.asInstanceOf[js.Any])
    
    inline def setShowPivotFieldListUndefined: Self = StObject.set(x, "showPivotFieldList", js.undefined)
    
    inline def setTables(value: TableCollectionLoadOptions): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setUse1904DateSystem(value: Boolean): Self = StObject.set(x, "use1904DateSystem", value.asInstanceOf[js.Any])
    
    inline def setUse1904DateSystemUndefined: Self = StObject.set(x, "use1904DateSystem", js.undefined)
    
    inline def setUsePrecisionAsDisplayed(value: Boolean): Self = StObject.set(x, "usePrecisionAsDisplayed", value.asInstanceOf[js.Any])
    
    inline def setUsePrecisionAsDisplayedUndefined: Self = StObject.set(x, "usePrecisionAsDisplayed", js.undefined)
  }
}
