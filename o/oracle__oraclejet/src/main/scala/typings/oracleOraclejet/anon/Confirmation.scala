package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Confirmation extends js.Object {
  var confirmation: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var warning: js.UndefOr[String] = js.native
}

object Confirmation {
  @scala.inline
  def apply(): Confirmation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Confirmation]
  }
  @scala.inline
  implicit class ConfirmationOps[Self <: Confirmation] (val x: Self) extends AnyVal {
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
    def setConfirmation(value: String): Self = this.set("confirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmation: Self = this.set("confirmation", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

