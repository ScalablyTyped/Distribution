package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveOptions extends js.Object {
  var safe: js.UndefOr[Boolean | WriteConcern] = js.native
  var session: js.UndefOr[ClientSession] = js.native
  var validateBeforeSave: js.UndefOr[Boolean] = js.native
}

object SaveOptions {
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  @scala.inline
  implicit class SaveOptionsOps[Self <: SaveOptions] (val x: Self) extends AnyVal {
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
    def setSafe(value: Boolean | WriteConcern): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setValidateBeforeSave(value: Boolean): Self = this.set("validateBeforeSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateBeforeSave: Self = this.set("validateBeforeSave", js.undefined)
  }
  
}

