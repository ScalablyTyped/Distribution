package typings.openfin.shapesIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderIdentity extends Identity {
  var channelId: js.UndefOr[String] = js.native
  var channelName: js.UndefOr[String] = js.native
  var isExternal: js.UndefOr[Boolean] = js.native
}

object ProviderIdentity {
  @scala.inline
  def apply(uuid: String): ProviderIdentity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderIdentity]
  }
  @scala.inline
  implicit class ProviderIdentityOps[Self <: ProviderIdentity] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    @scala.inline
    def setIsExternal(value: Boolean): Self = this.set("isExternal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExternal: Self = this.set("isExternal", js.undefined)
  }
  
}

