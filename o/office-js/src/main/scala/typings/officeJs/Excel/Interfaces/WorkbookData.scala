package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `workbook.toJSON()`. */
trait WorkbookData extends StObject {
  
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
  var bindings: js.UndefOr[js.Array[BindingData]] = js.undefined
  
  /**
    * Returns a number about the version of Excel Calculation Engine.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents a collection of comments associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.undefined
  
  /**
    * Represents the collection of custom XML parts contained by this workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    */
  var customXmlParts: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
  
  /**
    * Specifies if changes have been made since the workbook was last saved.
    You can set this property to `true` if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the workbook name.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Represents a collection of workbook-scoped named items (named ranges and constants).
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.undefined
  
  /**
    * Represents a collection of PivotTableStyles associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var pivotTableStyles: js.UndefOr[js.Array[PivotTableStyleData]] = js.undefined
  
  /**
    * Represents a collection of PivotTables associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.undefined
  
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
  var properties: js.UndefOr[DocumentPropertiesData] = js.undefined
  
  /**
    * Returns the protection object for a workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var protection: js.UndefOr[WorkbookProtectionData] = js.undefined
  
  /**
    * Returns `true` if the workbook is open in read-only mode.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents a collection of settings associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var settings: js.UndefOr[js.Array[SettingData]] = js.undefined
  
  /**
    * Represents a collection of SlicerStyles associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var slicerStyles: js.UndefOr[js.Array[SlicerStyleData]] = js.undefined
  
  /**
    * Represents a collection of slicers associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var slicers: js.UndefOr[js.Array[SlicerData]] = js.undefined
  
  /**
    * Represents a collection of styles associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var styles: js.UndefOr[js.Array[StyleData]] = js.undefined
  
  /**
    * Represents a collection of TableStyles associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var tableStyles: js.UndefOr[js.Array[TableStyleData]] = js.undefined
  
  /**
    * Represents a collection of tables associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  
  /**
    * Represents a collection of TimelineStyles associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var timelineStyles: js.UndefOr[js.Array[TimelineStyleData]] = js.undefined
  
  /**
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from `false` to `true`.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents a collection of worksheets associated with the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var worksheets: js.UndefOr[js.Array[WorksheetData]] = js.undefined
}
object WorkbookData {
  
  inline def apply(): WorkbookData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookData] (val x: Self) extends AnyVal {
    
    inline def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setBindings(value: js.Array[BindingData]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: BindingData*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setCalculationEngineVersion(value: Double): Self = StObject.set(x, "calculationEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setCalculationEngineVersionUndefined: Self = StObject.set(x, "calculationEngineVersion", js.undefined)
    
    inline def setChartDataPointTrack(value: Boolean): Self = StObject.set(x, "chartDataPointTrack", value.asInstanceOf[js.Any])
    
    inline def setChartDataPointTrackUndefined: Self = StObject.set(x, "chartDataPointTrack", js.undefined)
    
    inline def setComments(value: js.Array[CommentData]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentData*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setCustomXmlParts(value: js.Array[CustomXmlPartData]): Self = StObject.set(x, "customXmlParts", value.asInstanceOf[js.Any])
    
    inline def setCustomXmlPartsUndefined: Self = StObject.set(x, "customXmlParts", js.undefined)
    
    inline def setCustomXmlPartsVarargs(value: CustomXmlPartData*): Self = StObject.set(x, "customXmlParts", js.Array(value*))
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNames(value: js.Array[NamedItemData]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: NamedItemData*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setPivotTableStyles(value: js.Array[PivotTableStyleData]): Self = StObject.set(x, "pivotTableStyles", value.asInstanceOf[js.Any])
    
    inline def setPivotTableStylesUndefined: Self = StObject.set(x, "pivotTableStyles", js.undefined)
    
    inline def setPivotTableStylesVarargs(value: PivotTableStyleData*): Self = StObject.set(x, "pivotTableStyles", js.Array(value*))
    
    inline def setPivotTables(value: js.Array[PivotTableData]): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    inline def setPivotTablesUndefined: Self = StObject.set(x, "pivotTables", js.undefined)
    
    inline def setPivotTablesVarargs(value: PivotTableData*): Self = StObject.set(x, "pivotTables", js.Array(value*))
    
    inline def setPreviouslySaved(value: Boolean): Self = StObject.set(x, "previouslySaved", value.asInstanceOf[js.Any])
    
    inline def setPreviouslySavedUndefined: Self = StObject.set(x, "previouslySaved", js.undefined)
    
    inline def setProperties(value: DocumentPropertiesData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setProtection(value: WorkbookProtectionData): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSettings(value: js.Array[SettingData]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: SettingData*): Self = StObject.set(x, "settings", js.Array(value*))
    
    inline def setSlicerStyles(value: js.Array[SlicerStyleData]): Self = StObject.set(x, "slicerStyles", value.asInstanceOf[js.Any])
    
    inline def setSlicerStylesUndefined: Self = StObject.set(x, "slicerStyles", js.undefined)
    
    inline def setSlicerStylesVarargs(value: SlicerStyleData*): Self = StObject.set(x, "slicerStyles", js.Array(value*))
    
    inline def setSlicers(value: js.Array[SlicerData]): Self = StObject.set(x, "slicers", value.asInstanceOf[js.Any])
    
    inline def setSlicersUndefined: Self = StObject.set(x, "slicers", js.undefined)
    
    inline def setSlicersVarargs(value: SlicerData*): Self = StObject.set(x, "slicers", js.Array(value*))
    
    inline def setStyles(value: js.Array[StyleData]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: StyleData*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTableStyles(value: js.Array[TableStyleData]): Self = StObject.set(x, "tableStyles", value.asInstanceOf[js.Any])
    
    inline def setTableStylesUndefined: Self = StObject.set(x, "tableStyles", js.undefined)
    
    inline def setTableStylesVarargs(value: TableStyleData*): Self = StObject.set(x, "tableStyles", js.Array(value*))
    
    inline def setTables(value: js.Array[TableData]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: TableData*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setTimelineStyles(value: js.Array[TimelineStyleData]): Self = StObject.set(x, "timelineStyles", value.asInstanceOf[js.Any])
    
    inline def setTimelineStylesUndefined: Self = StObject.set(x, "timelineStyles", js.undefined)
    
    inline def setTimelineStylesVarargs(value: TimelineStyleData*): Self = StObject.set(x, "timelineStyles", js.Array(value*))
    
    inline def setUsePrecisionAsDisplayed(value: Boolean): Self = StObject.set(x, "usePrecisionAsDisplayed", value.asInstanceOf[js.Any])
    
    inline def setUsePrecisionAsDisplayedUndefined: Self = StObject.set(x, "usePrecisionAsDisplayed", js.undefined)
    
    inline def setWorksheets(value: js.Array[WorksheetData]): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
    
    inline def setWorksheetsUndefined: Self = StObject.set(x, "worksheets", js.undefined)
    
    inline def setWorksheetsVarargs(value: WorksheetData*): Self = StObject.set(x, "worksheets", js.Array(value*))
  }
}
