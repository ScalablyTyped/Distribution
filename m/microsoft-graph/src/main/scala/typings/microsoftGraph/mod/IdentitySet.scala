package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitySet extends js.Object {
  // Optional. The application associated with this action.
  var application: js.UndefOr[Identity] = js.native
  // Optional. The device associated with this action.
  var device: js.UndefOr[Identity] = js.native
  // Optional. The user associated with this action.
  var user: js.UndefOr[Identity] = js.native
}

object IdentitySet {
  @scala.inline
  def apply(): IdentitySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitySet]
  }
  @scala.inline
  implicit class IdentitySetOps[Self <: IdentitySet] (val x: Self) extends AnyVal {
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
    def setApplication(value: Identity): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setDevice(value: Identity): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setUser(value: Identity): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

