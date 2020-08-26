package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.rackspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RackspaceProviderOptions extends js.Object {
  var apiKey: String = js.native
  var provider: rackspace = js.native
  var region: RackspaceRegions = js.native
  var useInternal: js.UndefOr[Boolean] = js.native
  var username: String = js.native
}

object RackspaceProviderOptions {
  @scala.inline
  def apply(apiKey: String, provider: rackspace, region: RackspaceRegions, username: String): RackspaceProviderOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RackspaceProviderOptions]
  }
  @scala.inline
  implicit class RackspaceProviderOptionsOps[Self <: RackspaceProviderOptions] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: rackspace): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: RackspaceRegions): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseInternal(value: Boolean): Self = this.set("useInternal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseInternal: Self = this.set("useInternal", js.undefined)
  }
  
}

