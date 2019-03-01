package typings
package officeDashJsLib.ExcelNs.InterfacesNs

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
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the Excel application instance that contains this workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var application: js.UndefOr[ApplicationLoadOptions] = js.undefined
  /**
    *
    * Represents a collection of bindings that are part of the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bindings: js.UndefOr[BindingCollectionLoadOptions] = js.undefined
  /**
    *
    * Gets the workbook name. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
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
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents a collection of tables associated with the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.undefined
}

object WorkbookLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    application: ApplicationLoadOptions = null,
    bindings: BindingCollectionLoadOptions = null,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    properties: DocumentPropertiesLoadOptions = null,
    protection: WorkbookProtectionLoadOptions = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    tables: TableCollectionLoadOptions = null
  ): WorkbookLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (application != null) __obj.updateDynamic("application")(application)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    __obj.asInstanceOf[WorkbookLoadOptions]
  }
}

