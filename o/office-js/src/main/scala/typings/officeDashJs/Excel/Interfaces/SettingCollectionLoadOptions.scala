package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of key-value pair setting objects that are part of the workbook. The scope is limited to per file and add-in (task-pane or content) combination.
  *
  * [Api set: ExcelApi 1.4]
  */
@js.native
trait SettingCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the key that represents the id of the Setting. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var key: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the value stored for this setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  var value: js.UndefOr[Boolean] = js.native
}

