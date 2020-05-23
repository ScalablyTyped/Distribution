package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousIPResponse extends Response {
  var ip_address: js.UndefOr[String] = js.undefined
  val is_anonymous: js.UndefOr[Boolean] = js.undefined
  val is_anonymous_proxy: js.UndefOr[Boolean] = js.undefined
  val is_anonymous_vpn: js.UndefOr[Boolean] = js.undefined
  val is_hosting_provider: js.UndefOr[Boolean] = js.undefined
  val is_public_proxy: js.UndefOr[Boolean] = js.undefined
  val is_tor_exit_node: js.UndefOr[Boolean] = js.undefined
}

object AnonymousIPResponse {
  @scala.inline
  def apply(
    ip_address: String = null,
    is_anonymous: js.UndefOr[Boolean] = js.undefined,
    is_anonymous_proxy: js.UndefOr[Boolean] = js.undefined,
    is_anonymous_vpn: js.UndefOr[Boolean] = js.undefined,
    is_hosting_provider: js.UndefOr[Boolean] = js.undefined,
    is_public_proxy: js.UndefOr[Boolean] = js.undefined,
    is_tor_exit_node: js.UndefOr[Boolean] = js.undefined
  ): AnonymousIPResponse = {
    val __obj = js.Dynamic.literal()
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    if (!js.isUndefined(is_anonymous)) __obj.updateDynamic("is_anonymous")(is_anonymous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_anonymous_proxy)) __obj.updateDynamic("is_anonymous_proxy")(is_anonymous_proxy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_anonymous_vpn)) __obj.updateDynamic("is_anonymous_vpn")(is_anonymous_vpn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_hosting_provider)) __obj.updateDynamic("is_hosting_provider")(is_hosting_provider.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_public_proxy)) __obj.updateDynamic("is_public_proxy")(is_public_proxy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_tor_exit_node)) __obj.updateDynamic("is_tor_exit_node")(is_tor_exit_node.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousIPResponse]
  }
}

