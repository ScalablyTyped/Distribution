package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookWorksheetProtection extends Entity {
  // Sheet protection options. Read-only.
  var options: js.UndefOr[WorkbookWorksheetProtectionOptions] = js.undefined
  // Indicates if the worksheet is protected. Read-only.
  var `protected`: js.UndefOr[Boolean] = js.undefined
}

object WorkbookWorksheetProtection {
  @scala.inline
  def apply(
    id: String = null,
    options: WorkbookWorksheetProtectionOptions = null,
    `protected`: js.UndefOr[Boolean] = js.undefined
  ): WorkbookWorksheetProtection = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookWorksheetProtection]
  }
}

