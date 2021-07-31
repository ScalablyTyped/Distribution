package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Workbook is the top level object which contains related workbook objects such as worksheets, tables, ranges, etc.
  To learn more about the workbook object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-workbooks | Work with workbooks using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.1]
  */
trait WorkbookLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the Excel application instance that contains this workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var application: js.UndefOr[ApplicationLoadOptions] = js.undefined
  
  /**
    *
    * Specifies if the workbook is in autosave mode.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSave: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents a collection of bindings that are part of the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bindings: js.UndefOr[BindingCollectionLoadOptions] = js.undefined
  
  /**
    *
    * Returns a number about the version of Excel Calculation Engine.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if changes have been made since the workbook was last saved.
    You can set this property to true if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns a collection of linked data types that are part of the workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var linkedDataTypes: js.UndefOr[LinkedDataTypeCollectionLoadOptions] = js.undefined
  
  /**
    *
    * Gets the workbook name.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the workbook has ever been saved locally or online.
    *
    * [Api set: ExcelApi 1.9]
    */
  var previouslySaved: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the workbook properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesLoadOptions] = js.undefined
  
  /**
    *
    * Returns the protection object for a workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var protection: js.UndefOr[WorkbookProtectionLoadOptions] = js.undefined
  
  /**
    *
    * True if the workbook is open in Read-only mode.
    *
    * [Api set: ExcelApi 1.8]
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether the PivotTable's field list pane is shown at the workbook level.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showPivotFieldList: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents a collection of tables associated with the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.undefined
  
  /**
    *
    * True if the workbook uses the 1904 date system.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var use1904DateSystem: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined
}
object WorkbookLoadOptions {
  
  @scala.inline
  def apply(): WorkbookLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookLoadOptions]
  }
  
  @scala.inline
  implicit class WorkbookLoadOptionsMutableBuilder[Self <: WorkbookLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setApplication(value: ApplicationLoadOptions): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    @scala.inline
    def setBindings(value: BindingCollectionLoadOptions): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setCalculationEngineVersion(value: Boolean): Self = StObject.set(x, "calculationEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationEngineVersionUndefined: Self = StObject.set(x, "calculationEngineVersion", js.undefined)
    
    @scala.inline
    def setChartDataPointTrack(value: Boolean): Self = StObject.set(x, "chartDataPointTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartDataPointTrackUndefined: Self = StObject.set(x, "chartDataPointTrack", js.undefined)
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    @scala.inline
    def setLinkedDataTypes(value: LinkedDataTypeCollectionLoadOptions): Self = StObject.set(x, "linkedDataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedDataTypesUndefined: Self = StObject.set(x, "linkedDataTypes", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPreviouslySaved(value: Boolean): Self = StObject.set(x, "previouslySaved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviouslySavedUndefined: Self = StObject.set(x, "previouslySaved", js.undefined)
    
    @scala.inline
    def setProperties(value: DocumentPropertiesLoadOptions): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setProtection(value: WorkbookProtectionLoadOptions): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setShowPivotFieldList(value: Boolean): Self = StObject.set(x, "showPivotFieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPivotFieldListUndefined: Self = StObject.set(x, "showPivotFieldList", js.undefined)
    
    @scala.inline
    def setTables(value: TableCollectionLoadOptions): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setUse1904DateSystem(value: Boolean): Self = StObject.set(x, "use1904DateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse1904DateSystemUndefined: Self = StObject.set(x, "use1904DateSystem", js.undefined)
    
    @scala.inline
    def setUsePrecisionAsDisplayed(value: Boolean): Self = StObject.set(x, "usePrecisionAsDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePrecisionAsDisplayedUndefined: Self = StObject.set(x, "usePrecisionAsDisplayed", js.undefined)
  }
}
