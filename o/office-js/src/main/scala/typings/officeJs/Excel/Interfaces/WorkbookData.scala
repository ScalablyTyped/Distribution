package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `workbook.toJSON()`. */
@js.native
trait WorkbookData extends StObject {
  
  /**
    *
    * Specifies if the workbook is in autosave mode.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSave: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents a collection of bindings that are part of the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bindings: js.UndefOr[js.Array[BindingData]] = js.native
  
  /**
    *
    * Returns a number about the version of Excel Calculation Engine.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Double] = js.native
  
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents a collection of Comments associated with the workbook.
    *
    * [Api set: ExcelApi 1.10]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.native
  
  /**
    *
    * Represents the collection of custom XML parts contained by this workbook.
    *
    * [Api set: ExcelApi 1.5]
    */
  var customXmlParts: js.UndefOr[js.Array[CustomXmlPartData]] = js.native
  
  /**
    *
    * Specifies if changes have been made since the workbook was last saved.
    You can set this property to true if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the workbook name.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents a collection of workbook scoped named items (named ranges and constants).
    *
    * [Api set: ExcelApi 1.1]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.native
  
  /**
    *
    * Represents a collection of PivotTableStyles associated with the workbook.
    *
    * [Api set: ExcelApi 1.10]
    */
  var pivotTableStyles: js.UndefOr[js.Array[PivotTableStyleData]] = js.native
  
  /**
    *
    * Represents a collection of PivotTables associated with the workbook.
    *
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.native
  
  /**
    *
    * Specifies if the workbook has ever been saved locally or online.
    *
    * [Api set: ExcelApi 1.9]
    */
  var previouslySaved: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the workbook properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesData] = js.native
  
  /**
    *
    * Returns the protection object for a workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var protection: js.UndefOr[WorkbookProtectionData] = js.native
  
  /**
    *
    * True if the workbook is open in Read-only mode.
    *
    * [Api set: ExcelApi 1.8]
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents a collection of Settings associated with the workbook.
    *
    * [Api set: ExcelApi 1.4]
    */
  var settings: js.UndefOr[js.Array[SettingData]] = js.native
  
  /**
    *
    * Represents a collection of SlicerStyles associated with the workbook.
    *
    * [Api set: ExcelApi 1.10]
    */
  var slicerStyles: js.UndefOr[js.Array[SlicerStyleData]] = js.native
  
  /**
    *
    * Represents a collection of Slicers associated with the workbook.
    *
    * [Api set: ExcelApi 1.10]
    */
  var slicers: js.UndefOr[js.Array[SlicerData]] = js.native
  
  /**
    *
    * Represents a collection of styles associated with the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var styles: js.UndefOr[js.Array[StyleData]] = js.native
  
  /**
    *
    * Represents a collection of TableStyles associated with the workbook.
    *
    * [Api set: ExcelApi 1.10]
    */
  var tableStyles: js.UndefOr[js.Array[TableStyleData]] = js.native
  
  /**
    *
    * Represents a collection of tables associated with the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.native
  
  /**
    *
    * Represents a collection of TimelineStyles associated with the workbook.
    *
    * [Api set: ExcelApi 1.10]
    */
  var timelineStyles: js.UndefOr[js.Array[TimelineStyleData]] = js.native
  
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents a collection of worksheets associated with the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheets: js.UndefOr[js.Array[WorksheetData]] = js.native
}
object WorkbookData {
  
  @scala.inline
  def apply(): WorkbookData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookData]
  }
  
  @scala.inline
  implicit class WorkbookDataMutableBuilder[Self <: WorkbookData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    @scala.inline
    def setBindings(value: js.Array[BindingData]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: BindingData*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setCalculationEngineVersion(value: Double): Self = StObject.set(x, "calculationEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationEngineVersionUndefined: Self = StObject.set(x, "calculationEngineVersion", js.undefined)
    
    @scala.inline
    def setChartDataPointTrack(value: Boolean): Self = StObject.set(x, "chartDataPointTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartDataPointTrackUndefined: Self = StObject.set(x, "chartDataPointTrack", js.undefined)
    
    @scala.inline
    def setComments(value: js.Array[CommentData]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentData*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setCustomXmlParts(value: js.Array[CustomXmlPartData]): Self = StObject.set(x, "customXmlParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomXmlPartsUndefined: Self = StObject.set(x, "customXmlParts", js.undefined)
    
    @scala.inline
    def setCustomXmlPartsVarargs(value: CustomXmlPartData*): Self = StObject.set(x, "customXmlParts", js.Array(value :_*))
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNames(value: js.Array[NamedItemData]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: NamedItemData*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setPivotTableStyles(value: js.Array[PivotTableStyleData]): Self = StObject.set(x, "pivotTableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotTableStylesUndefined: Self = StObject.set(x, "pivotTableStyles", js.undefined)
    
    @scala.inline
    def setPivotTableStylesVarargs(value: PivotTableStyleData*): Self = StObject.set(x, "pivotTableStyles", js.Array(value :_*))
    
    @scala.inline
    def setPivotTables(value: js.Array[PivotTableData]): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotTablesUndefined: Self = StObject.set(x, "pivotTables", js.undefined)
    
    @scala.inline
    def setPivotTablesVarargs(value: PivotTableData*): Self = StObject.set(x, "pivotTables", js.Array(value :_*))
    
    @scala.inline
    def setPreviouslySaved(value: Boolean): Self = StObject.set(x, "previouslySaved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviouslySavedUndefined: Self = StObject.set(x, "previouslySaved", js.undefined)
    
    @scala.inline
    def setProperties(value: DocumentPropertiesData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setProtection(value: WorkbookProtectionData): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSettings(value: js.Array[SettingData]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: SettingData*): Self = StObject.set(x, "settings", js.Array(value :_*))
    
    @scala.inline
    def setSlicerStyles(value: js.Array[SlicerStyleData]): Self = StObject.set(x, "slicerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicerStylesUndefined: Self = StObject.set(x, "slicerStyles", js.undefined)
    
    @scala.inline
    def setSlicerStylesVarargs(value: SlicerStyleData*): Self = StObject.set(x, "slicerStyles", js.Array(value :_*))
    
    @scala.inline
    def setSlicers(value: js.Array[SlicerData]): Self = StObject.set(x, "slicers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicersUndefined: Self = StObject.set(x, "slicers", js.undefined)
    
    @scala.inline
    def setSlicersVarargs(value: SlicerData*): Self = StObject.set(x, "slicers", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[StyleData]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: StyleData*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setTableStyles(value: js.Array[TableStyleData]): Self = StObject.set(x, "tableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStylesUndefined: Self = StObject.set(x, "tableStyles", js.undefined)
    
    @scala.inline
    def setTableStylesVarargs(value: TableStyleData*): Self = StObject.set(x, "tableStyles", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[TableData]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: TableData*): Self = StObject.set(x, "tables", js.Array(value :_*))
    
    @scala.inline
    def setTimelineStyles(value: js.Array[TimelineStyleData]): Self = StObject.set(x, "timelineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineStylesUndefined: Self = StObject.set(x, "timelineStyles", js.undefined)
    
    @scala.inline
    def setTimelineStylesVarargs(value: TimelineStyleData*): Self = StObject.set(x, "timelineStyles", js.Array(value :_*))
    
    @scala.inline
    def setUsePrecisionAsDisplayed(value: Boolean): Self = StObject.set(x, "usePrecisionAsDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePrecisionAsDisplayedUndefined: Self = StObject.set(x, "usePrecisionAsDisplayed", js.undefined)
    
    @scala.inline
    def setWorksheets(value: js.Array[WorksheetData]): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetsUndefined: Self = StObject.set(x, "worksheets", js.undefined)
    
    @scala.inline
    def setWorksheetsVarargs(value: WorksheetData*): Self = StObject.set(x, "worksheets", js.Array(value :_*))
  }
}
