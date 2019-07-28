package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "workbook.toJSON()". */
trait WorkbookData extends js.Object {
  /**
    *
    * Specifies whether or not the workbook is in autosave mode. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSave: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents a collection of bindings that are part of the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bindings: js.UndefOr[js.Array[BindingData]] = js.undefined
  /**
    *
    * Returns a number about the version of Excel Calculation Engine. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Double] = js.undefined
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
    * Represents the collection of custom XML parts contained by this workbook. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var customXmlParts: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
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
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents a collection of workbook scoped named items (named ranges and constants). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.undefined
  /**
    *
    * Represents a collection of PivotTables associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.undefined
  /**
    *
    * Specifies whether or not the workbook has ever been saved locally or online. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var previouslySaved: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the workbook properties. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesData] = js.undefined
  /**
    *
    * Returns workbook protection object for a workbook. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var protection: js.UndefOr[WorkbookProtectionData] = js.undefined
  /**
    *
    * True if the workbook is open in Read-only mode. Read-only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents a collection of Settings associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var settings: js.UndefOr[js.Array[SettingData]] = js.undefined
  /**
    *
    * Represents a collection of styles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var styles: js.UndefOr[js.Array[StyleData]] = js.undefined
  /**
    *
    * Represents a collection of tables associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents a collection of worksheets associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheets: js.UndefOr[js.Array[WorksheetData]] = js.undefined
}

object WorkbookData {
  @scala.inline
  def apply(
    autoSave: js.UndefOr[Boolean] = js.undefined,
    bindings: js.Array[BindingData] = null,
    calculationEngineVersion: Int | Double = null,
    chartDataPointTrack: js.UndefOr[Boolean] = js.undefined,
    customXmlParts: js.Array[CustomXmlPartData] = null,
    isDirty: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    names: js.Array[NamedItemData] = null,
    pivotTables: js.Array[PivotTableData] = null,
    previouslySaved: js.UndefOr[Boolean] = js.undefined,
    properties: DocumentPropertiesData = null,
    protection: WorkbookProtectionData = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    settings: js.Array[SettingData] = null,
    styles: js.Array[StyleData] = null,
    tables: js.Array[TableData] = null,
    usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined,
    worksheets: js.Array[WorksheetData] = null
  ): WorkbookData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (calculationEngineVersion != null) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(chartDataPointTrack)) __obj.updateDynamic("chartDataPointTrack")(chartDataPointTrack)
    if (customXmlParts != null) __obj.updateDynamic("customXmlParts")(customXmlParts)
    if (!js.isUndefined(isDirty)) __obj.updateDynamic("isDirty")(isDirty)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (pivotTables != null) __obj.updateDynamic("pivotTables")(pivotTables)
    if (!js.isUndefined(previouslySaved)) __obj.updateDynamic("previouslySaved")(previouslySaved)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (!js.isUndefined(usePrecisionAsDisplayed)) __obj.updateDynamic("usePrecisionAsDisplayed")(usePrecisionAsDisplayed)
    if (worksheets != null) __obj.updateDynamic("worksheets")(worksheets)
    __obj.asInstanceOf[WorkbookData]
  }
}

