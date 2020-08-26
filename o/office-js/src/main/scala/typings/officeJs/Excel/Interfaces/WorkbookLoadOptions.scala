package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Workbook is the top level object which contains related workbook objects such as worksheets, tables, ranges, etc.
  To learn more about the workbook object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-workbooks | Work with workbooks using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait WorkbookLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the Excel application instance that contains this workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var application: js.UndefOr[ApplicationLoadOptions] = js.native
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
  var bindings: js.UndefOr[BindingCollectionLoadOptions] = js.native
  /**
    *
    * Returns a number about the version of Excel Calculation Engine.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Boolean] = js.native
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
  var name: js.UndefOr[Boolean] = js.native
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
  var properties: js.UndefOr[DocumentPropertiesLoadOptions] = js.native
  /**
    *
    * Returns the protection object for a workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var protection: js.UndefOr[WorkbookProtectionLoadOptions] = js.native
  /**
    *
    * True if the workbook is open in Read-only mode.
    *
    * [Api set: ExcelApi 1.8]
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents a collection of tables associated with the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.native
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.native
}

object WorkbookLoadOptions {
  @scala.inline
  def apply(): WorkbookLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookLoadOptions]
  }
  @scala.inline
  implicit class WorkbookLoadOptionsOps[Self <: WorkbookLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setApplication(value: ApplicationLoadOptions): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setAutoSave(value: Boolean): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    @scala.inline
    def setBindings(value: BindingCollectionLoadOptions): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    @scala.inline
    def setCalculationEngineVersion(value: Boolean): Self = this.set("calculationEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculationEngineVersion: Self = this.set("calculationEngineVersion", js.undefined)
    @scala.inline
    def setChartDataPointTrack(value: Boolean): Self = this.set("chartDataPointTrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartDataPointTrack: Self = this.set("chartDataPointTrack", js.undefined)
    @scala.inline
    def setIsDirty(value: Boolean): Self = this.set("isDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPreviouslySaved(value: Boolean): Self = this.set("previouslySaved", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviouslySaved: Self = this.set("previouslySaved", js.undefined)
    @scala.inline
    def setProperties(value: DocumentPropertiesLoadOptions): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setProtection(value: WorkbookProtectionLoadOptions): Self = this.set("protection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setTables(value: TableCollectionLoadOptions): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    @scala.inline
    def setUsePrecisionAsDisplayed(value: Boolean): Self = this.set("usePrecisionAsDisplayed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePrecisionAsDisplayed: Self = this.set("usePrecisionAsDisplayed", js.undefined)
  }
  
}

