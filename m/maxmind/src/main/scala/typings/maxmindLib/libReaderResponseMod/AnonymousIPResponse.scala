package typings
package maxmindLib.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousIPResponse extends Response {
  var ip_address: js.UndefOr[java.lang.String] = js.undefined
  val is_anonymous: js.UndefOr[scala.Boolean] = js.undefined
  val is_anonymous_proxy: js.UndefOr[scala.Boolean] = js.undefined
  val is_anonymous_vpn: js.UndefOr[scala.Boolean] = js.undefined
  val is_hosting_provider: js.UndefOr[scala.Boolean] = js.undefined
  val is_public_proxy: js.UndefOr[scala.Boolean] = js.undefined
  val is_tor_exit_node: js.UndefOr[scala.Boolean] = js.undefined
}

object AnonymousIPResponse {
  @scala.inline
  def apply(
    ip_address: java.lang.String = null,
    is_anonymous: js.UndefOr[scala.Boolean] = js.undefined,
    is_anonymous_proxy: js.UndefOr[scala.Boolean] = js.undefined,
    is_anonymous_vpn: js.UndefOr[scala.Boolean] = js.undefined,
    is_hosting_provider: js.UndefOr[scala.Boolean] = js.undefined,
    is_public_proxy: js.UndefOr[scala.Boolean] = js.undefined,
    is_tor_exit_node: js.UndefOr[scala.Boolean] = js.undefined
  ): AnonymousIPResponse = {
    val __obj = js.Dynamic.literal()
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address)
    if (!js.isUndefined(is_anonymous)) __obj.updateDynamic("is_anonymous")(is_anonymous)
    if (!js.isUndefined(is_anonymous_proxy)) __obj.updateDynamic("is_anonymous_proxy")(is_anonymous_proxy)
    if (!js.isUndefined(is_anonymous_vpn)) __obj.updateDynamic("is_anonymous_vpn")(is_anonymous_vpn)
    if (!js.isUndefined(is_hosting_provider)) __obj.updateDynamic("is_hosting_provider")(is_hosting_provider)
    if (!js.isUndefined(is_public_proxy)) __obj.updateDynamic("is_public_proxy")(is_public_proxy)
    if (!js.isUndefined(is_tor_exit_node)) __obj.updateDynamic("is_tor_exit_node")(is_tor_exit_node)
    __obj.asInstanceOf[AnonymousIPResponse]
  }
}

