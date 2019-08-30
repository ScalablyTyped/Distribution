package typings.pkgcloud.pkgcloudMod

import typings.pkgcloud.pkgcloudStrings.rackspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RackspaceProviderOptions extends js.Object {
  var apiKey: String
  var provider: rackspace
  var region: RackspaceRegions
  var useInternal: js.UndefOr[Boolean] = js.undefined
  var username: String
}

object RackspaceProviderOptions {
  @scala.inline
  def apply(
    apiKey: String,
    provider: rackspace,
    region: RackspaceRegions,
    username: String,
    useInternal: js.UndefOr[Boolean] = js.undefined
  ): RackspaceProviderOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, provider = provider, region = region, username = username)
    if (!js.isUndefined(useInternal)) __obj.updateDynamic("useInternal")(useInternal)
    __obj.asInstanceOf[RackspaceProviderOptions]
  }
}

