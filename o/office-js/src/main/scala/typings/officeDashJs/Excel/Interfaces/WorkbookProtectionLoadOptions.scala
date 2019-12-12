package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the protection of a workbook object.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait WorkbookProtectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if the workbook is protected. Read-Only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `protected`: js.UndefOr[Boolean] = js.native
}

