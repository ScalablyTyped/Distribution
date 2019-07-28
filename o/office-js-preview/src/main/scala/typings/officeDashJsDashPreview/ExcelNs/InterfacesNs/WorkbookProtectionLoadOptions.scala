package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

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
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[WorkbookProtectionLoadOptions]
  }
}

