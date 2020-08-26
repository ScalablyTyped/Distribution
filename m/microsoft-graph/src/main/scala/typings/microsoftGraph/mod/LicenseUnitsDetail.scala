package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseUnitsDetail extends js.Object {
  // The number of units that are enabled.
  var enabled: js.UndefOr[Double] = js.native
  // The number of units that are suspended.
  var suspended: js.UndefOr[Double] = js.native
  // The number of units that are in warning status.
  var warning: js.UndefOr[Double] = js.native
}

object LicenseUnitsDetail {
  @scala.inline
  def apply(): LicenseUnitsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseUnitsDetail]
  }
  @scala.inline
  implicit class LicenseUnitsDetailOps[Self <: LicenseUnitsDetail] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Double): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setSuspended(value: Double): Self = this.set("suspended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspended: Self = this.set("suspended", js.undefined)
    @scala.inline
    def setWarning(value: Double): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

