package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the protection of a workbook object.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorkbookProtectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if the workbook is protected. Read-Only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `protected`: js.UndefOr[Boolean] = js.undefined
}

object WorkbookProtectionLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, `protected`: js.UndefOr[Boolean] = js.undefined): WorkbookProtectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookProtectionLoadOptions]
  }
}

