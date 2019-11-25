package typings.maxmind.libReaderResponseMod

import typings.maxmind.maxmindStrings.business
import typings.maxmind.maxmindStrings.cafe
import typings.maxmind.maxmindStrings.cellular
import typings.maxmind.maxmindStrings.college
import typings.maxmind.maxmindStrings.content_delivery_network
import typings.maxmind.maxmindStrings.dialup
import typings.maxmind.maxmindStrings.government
import typings.maxmind.maxmindStrings.hosting
import typings.maxmind.maxmindStrings.library
import typings.maxmind.maxmindStrings.military
import typings.maxmind.maxmindStrings.residential
import typings.maxmind.maxmindStrings.router
import typings.maxmind.maxmindStrings.school
import typings.maxmind.maxmindStrings.search_engine_spider
import typings.maxmind.maxmindStrings.traveler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraitsRecord extends js.Object {
  val autonomous_system_number: js.UndefOr[Double] = js.undefined
  val autonomous_system_organization: js.UndefOr[String] = js.undefined
  val domain: js.UndefOr[String] = js.undefined
  var ip_address: js.UndefOr[String] = js.undefined
  val is_anonymous: js.UndefOr[Boolean] = js.undefined
  val is_anonymous_proxy: js.UndefOr[Boolean] = js.undefined
  val is_anonymous_vpn: js.UndefOr[Boolean] = js.undefined
  val is_hosting_provider: js.UndefOr[Boolean] = js.undefined
  val is_legitimate_proxy: js.UndefOr[Boolean] = js.undefined
  val is_public_proxy: js.UndefOr[Boolean] = js.undefined
  val is_satellite_provider: js.UndefOr[Boolean] = js.undefined
  val is_tor_exit_node: js.UndefOr[Boolean] = js.undefined
  val isp: js.UndefOr[String] = js.undefined
  val organization: js.UndefOr[String] = js.undefined
  val user_type: js.UndefOr[
    business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler
  ] = js.undefined
}

object TraitsRecord {
  @scala.inline
  def apply(
    autonomous_system_number: Int | Double = null,
    autonomous_system_organization: String = null,
    domain: String = null,
    ip_address: String = null,
    is_anonymous: js.UndefOr[Boolean] = js.undefined,
    is_anonymous_proxy: js.UndefOr[Boolean] = js.undefined,
    is_anonymous_vpn: js.UndefOr[Boolean] = js.undefined,
    is_hosting_provider: js.UndefOr[Boolean] = js.undefined,
    is_legitimate_proxy: js.UndefOr[Boolean] = js.undefined,
    is_public_proxy: js.UndefOr[Boolean] = js.undefined,
    is_satellite_provider: js.UndefOr[Boolean] = js.undefined,
    is_tor_exit_node: js.UndefOr[Boolean] = js.undefined,
    isp: String = null,
    organization: String = null,
    user_type: business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler = null
  ): TraitsRecord = {
    val __obj = js.Dynamic.literal()
    if (autonomous_system_number != null) __obj.updateDynamic("autonomous_system_number")(autonomous_system_number.asInstanceOf[js.Any])
    if (autonomous_system_organization != null) __obj.updateDynamic("autonomous_system_organization")(autonomous_system_organization.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    if (!js.isUndefined(is_anonymous)) __obj.updateDynamic("is_anonymous")(is_anonymous.asInstanceOf[js.Any])
    if (!js.isUndefined(is_anonymous_proxy)) __obj.updateDynamic("is_anonymous_proxy")(is_anonymous_proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(is_anonymous_vpn)) __obj.updateDynamic("is_anonymous_vpn")(is_anonymous_vpn.asInstanceOf[js.Any])
    if (!js.isUndefined(is_hosting_provider)) __obj.updateDynamic("is_hosting_provider")(is_hosting_provider.asInstanceOf[js.Any])
    if (!js.isUndefined(is_legitimate_proxy)) __obj.updateDynamic("is_legitimate_proxy")(is_legitimate_proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(is_public_proxy)) __obj.updateDynamic("is_public_proxy")(is_public_proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(is_satellite_provider)) __obj.updateDynamic("is_satellite_provider")(is_satellite_provider.asInstanceOf[js.Any])
    if (!js.isUndefined(is_tor_exit_node)) __obj.updateDynamic("is_tor_exit_node")(is_tor_exit_node.asInstanceOf[js.Any])
    if (isp != null) __obj.updateDynamic("isp")(isp.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (user_type != null) __obj.updateDynamic("user_type")(user_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraitsRecord]
  }
}

