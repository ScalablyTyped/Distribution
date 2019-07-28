package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Workbook is the top level object which contains related workbook objects such as worksheets, tables, ranges, etc.
  *
  * [Api set: ExcelApi 1.1]
  */
trait WorkbookLoadOptions extends js.Object {
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
    * Specifies whether or not the workbook is in autosave mode. Read-Only.
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
    * Returns a number about the version of Excel Calculation Engine. Read-Only.
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
    * Specifies whether or not changes have been made since the workbook was last saved.
    You can set this property to true if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the workbook name. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the workbook has ever been saved locally or online. Read-Only.
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
    * Returns workbook protection object for a workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var protection: js.UndefOr[WorkbookProtectionLoadOptions] = js.undefined
  /**
    *
    * True if the workbook is open in Read-only mode. Read-only.
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
    use1904DateSystem: js.UndefOr[Boolean] = js.undefined,
    usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined
  ): WorkbookLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (application != null) __obj.updateDynamic("application")(application)
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (!js.isUndefined(calculationEngineVersion)) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion)
    if (!js.isUndefined(chartDataPointTrack)) __obj.updateDynamic("chartDataPointTrack")(chartDataPointTrack)
    if (!js.isUndefined(isDirty)) __obj.updateDynamic("isDirty")(isDirty)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(previouslySaved)) __obj.updateDynamic("previouslySaved")(previouslySaved)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (!js.isUndefined(use1904DateSystem)) __obj.updateDynamic("use1904DateSystem")(use1904DateSystem)
    if (!js.isUndefined(usePrecisionAsDisplayed)) __obj.updateDynamic("usePrecisionAsDisplayed")(usePrecisionAsDisplayed)
    __obj.asInstanceOf[WorkbookLoadOptions]
  }
}

