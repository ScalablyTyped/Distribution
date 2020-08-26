package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookWorksheetProtection extends Entity {
  // Sheet protection options. Read-only.
  var options: js.UndefOr[WorkbookWorksheetProtectionOptions] = js.native
  // Indicates if the worksheet is protected. Read-only.
  var `protected`: js.UndefOr[Boolean] = js.native
}

object WorkbookWorksheetProtection {
  @scala.inline
  def apply(): WorkbookWorksheetProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheetProtection]
  }
  @scala.inline
  implicit class WorkbookWorksheetProtectionOps[Self <: WorkbookWorksheetProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOptions(value: WorkbookWorksheetProtectionOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setProtected(value: Boolean): Self = this.set("protected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtected: Self = this.set("protected", js.undefined)
  }
  
}

