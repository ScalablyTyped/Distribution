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
trait WorkbookLoadOptions extends js.Object {
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
    * Represents a collection of tables associated with the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.undefined
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
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    application: ApplicationLoadOptions = null,
    autoSave: js.UndefOr[Boolean] = js.undefined,
    bindings: BindingCollectionLoadOptions = null,
    calculationEngineVersion: js.UndefOr[Boolean] = js.undefined,
    chartDataPointTrack: js.UndefOr[Boolean] = js.undefined,
    isDirty: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    previouslySaved: js.UndefOr[Boolean] = js.undefined,
    properties: DocumentPropertiesLoadOptions = null,
    protection: WorkbookProtectionLoadOptions = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    tables: TableCollectionLoadOptions = null,
    usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined
  ): WorkbookLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave.get.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (!js.isUndefined(calculationEngineVersion)) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chartDataPointTrack)) __obj.updateDynamic("chartDataPointTrack")(chartDataPointTrack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirty)) __obj.updateDynamic("isDirty")(isDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.get.asInstanceOf[js.Any])
    if (!js.isUndefined(previouslySaved)) __obj.updateDynamic("previouslySaved")(previouslySaved.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (!js.isUndefined(usePrecisionAsDisplayed)) __obj.updateDynamic("usePrecisionAsDisplayed")(usePrecisionAsDisplayed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookLoadOptions]
  }
}

