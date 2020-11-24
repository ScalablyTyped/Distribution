package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `workbook.toJSON()`. */
@js.native
trait WorkbookData extends js.Object {
  
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
  implicit class WorkbookDataOps[Self <: WorkbookData] (val x: Self) extends AnyVal {
    
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
    def setAutoSave(value: Boolean): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: BindingData*): Self = this.set("bindings", js.Array(value :_*))
    
    @scala.inline
    def setBindings(value: js.Array[BindingData]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setCalculationEngineVersion(value: Double): Self = this.set("calculationEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculationEngineVersion: Self = this.set("calculationEngineVersion", js.undefined)
    
    @scala.inline
    def setChartDataPointTrack(value: Boolean): Self = this.set("chartDataPointTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartDataPointTrack: Self = this.set("chartDataPointTrack", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentData*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentData]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCustomXmlPartsVarargs(value: CustomXmlPartData*): Self = this.set("customXmlParts", js.Array(value :_*))
    
    @scala.inline
    def setCustomXmlParts(value: js.Array[CustomXmlPartData]): Self = this.set("customXmlParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomXmlParts: Self = this.set("customXmlParts", js.undefined)
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = this.set("isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: NamedItemData*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[NamedItemData]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    
    @scala.inline
    def setPivotTableStylesVarargs(value: PivotTableStyleData*): Self = this.set("pivotTableStyles", js.Array(value :_*))
    
    @scala.inline
    def setPivotTableStyles(value: js.Array[PivotTableStyleData]): Self = this.set("pivotTableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotTableStyles: Self = this.set("pivotTableStyles", js.undefined)
    
    @scala.inline
    def setPivotTablesVarargs(value: PivotTableData*): Self = this.set("pivotTables", js.Array(value :_*))
    
    @scala.inline
    def setPivotTables(value: js.Array[PivotTableData]): Self = this.set("pivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotTables: Self = this.set("pivotTables", js.undefined)
    
    @scala.inline
    def setPreviouslySaved(value: Boolean): Self = this.set("previouslySaved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviouslySaved: Self = this.set("previouslySaved", js.undefined)
    
    @scala.inline
    def setProperties(value: DocumentPropertiesData): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setProtection(value: WorkbookProtectionData): Self = this.set("protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: SettingData*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[SettingData]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setSlicerStylesVarargs(value: SlicerStyleData*): Self = this.set("slicerStyles", js.Array(value :_*))
    
    @scala.inline
    def setSlicerStyles(value: js.Array[SlicerStyleData]): Self = this.set("slicerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlicerStyles: Self = this.set("slicerStyles", js.undefined)
    
    @scala.inline
    def setSlicersVarargs(value: SlicerData*): Self = this.set("slicers", js.Array(value :_*))
    
    @scala.inline
    def setSlicers(value: js.Array[SlicerData]): Self = this.set("slicers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlicers: Self = this.set("slicers", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: StyleData*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[StyleData]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTableStylesVarargs(value: TableStyleData*): Self = this.set("tableStyles", js.Array(value :_*))
    
    @scala.inline
    def setTableStyles(value: js.Array[TableStyleData]): Self = this.set("tableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStyles: Self = this.set("tableStyles", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: TableData*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[TableData]): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    
    @scala.inline
    def setTimelineStylesVarargs(value: TimelineStyleData*): Self = this.set("timelineStyles", js.Array(value :_*))
    
    @scala.inline
    def setTimelineStyles(value: js.Array[TimelineStyleData]): Self = this.set("timelineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimelineStyles: Self = this.set("timelineStyles", js.undefined)
    
    @scala.inline
    def setUsePrecisionAsDisplayed(value: Boolean): Self = this.set("usePrecisionAsDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePrecisionAsDisplayed: Self = this.set("usePrecisionAsDisplayed", js.undefined)
    
    @scala.inline
    def setWorksheetsVarargs(value: WorksheetData*): Self = this.set("worksheets", js.Array(value :_*))
    
    @scala.inline
    def setWorksheets(value: js.Array[WorksheetData]): Self = this.set("worksheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorksheets: Self = this.set("worksheets", js.undefined)
  }
}
