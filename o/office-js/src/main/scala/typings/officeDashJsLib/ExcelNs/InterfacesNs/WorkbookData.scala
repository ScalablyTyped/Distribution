package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "workbook.toJSON()". */
trait WorkbookData extends js.Object {
  /**
    *
    * Represents a collection of bindings that are part of the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bindings: js.UndefOr[js.Array[BindingData]] = js.undefined
  /**
    *
    * Represents the collection of custom XML parts contained by this workbook. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var customXmlParts: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
  /**
    *
    * Gets the workbook name. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
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
    * Represents a collection of worksheets associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheets: js.UndefOr[js.Array[WorksheetData]] = js.undefined
}

object WorkbookData {
  @scala.inline
  def apply(
    bindings: js.Array[BindingData] = null,
    customXmlParts: js.Array[CustomXmlPartData] = null,
    name: java.lang.String = null,
    names: js.Array[NamedItemData] = null,
    pivotTables: js.Array[PivotTableData] = null,
    properties: DocumentPropertiesData = null,
    protection: WorkbookProtectionData = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    settings: js.Array[SettingData] = null,
    styles: js.Array[StyleData] = null,
    tables: js.Array[TableData] = null,
    worksheets: js.Array[WorksheetData] = null
  ): WorkbookData = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (customXmlParts != null) __obj.updateDynamic("customXmlParts")(customXmlParts)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (pivotTables != null) __obj.updateDynamic("pivotTables")(pivotTables)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (worksheets != null) __obj.updateDynamic("worksheets")(worksheets)
    __obj.asInstanceOf[WorkbookData]
  }
}

