package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OmaSetting extends js.Object {
  // Description.
  var description: js.UndefOr[String] = js.native
  // Display Name.
  var displayName: js.UndefOr[String] = js.native
  // OMA.
  var omaUri: js.UndefOr[String] = js.native
}

object OmaSetting {
  @scala.inline
  def apply(): OmaSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSetting]
  }
  @scala.inline
  implicit class OmaSettingOps[Self <: OmaSetting] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setOmaUri(value: String): Self = this.set("omaUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmaUri: Self = this.set("omaUri", js.undefined)
  }
  
}

