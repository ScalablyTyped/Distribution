package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "workbookProtection.toJSON()". */
trait WorkbookProtectionData extends js.Object {
  /**
    *
    * Indicates if the workbook is protected. Read-Only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `protected`: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkbookProtectionData {
  @scala.inline
  def apply(`protected`: js.UndefOr[scala.Boolean] = js.undefined): WorkbookProtectionData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[WorkbookProtectionData]
  }
}

