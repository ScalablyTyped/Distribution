package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookWorksheetProtection extends Entity {
  /** Sheet protection options. Read-only. */
  var options: js.UndefOr[WorkbookWorksheetProtectionOptions] = js.undefined
  /** Indicates if the worksheet is protected.  Read-only. */
  var `protected`: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkbookWorksheetProtection {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    options: WorkbookWorksheetProtectionOptions = null,
    `protected`: js.UndefOr[scala.Boolean] = js.undefined
  ): WorkbookWorksheetProtection = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[WorkbookWorksheetProtection]
  }
}

