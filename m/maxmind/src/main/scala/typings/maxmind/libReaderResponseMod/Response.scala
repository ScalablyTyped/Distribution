package typings.maxmind.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.maxmind.libReaderResponseMod.CountryResponse
  - typings.maxmind.libReaderResponseMod.CityResponse
  - typings.maxmind.libReaderResponseMod.AnonymousIPResponse
  - typings.maxmind.libReaderResponseMod.AsnResponse
  - typings.maxmind.libReaderResponseMod.ConnectionTypeResponse
  - typings.maxmind.libReaderResponseMod.DomainResponse
  - typings.maxmind.libReaderResponseMod.IspResponse
*/
trait Response extends js.Object

object Response {
  @scala.inline
  def IspResponse(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    isp: String,
    organization: String,
    ip_address: String = null
  ): Response = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  def AnonymousIPResponse(
    ip_address: String = null,
    is_anonymous: js.UndefOr[Boolean] = js.undefined,
    is_anonymous_proxy: js.UndefOr[Boolean] = js.undefined,
    is_anonymous_vpn: js.UndefOr[Boolean] = js.undefined,
    is_hosting_provider: js.UndefOr[Boolean] = js.undefined,
    is_public_proxy: js.UndefOr[Boolean] = js.undefined,
    is_tor_exit_node: js.UndefOr[Boolean] = js.undefined
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    if (!js.isUndefined(is_anonymous)) __obj.updateDynamic("is_anonymous")(is_anonymous.asInstanceOf[js.Any])
    if (!js.isUndefined(is_anonymous_proxy)) __obj.updateDynamic("is_anonymous_proxy")(is_anonymous_proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(is_anonymous_vpn)) __obj.updateDynamic("is_anonymous_vpn")(is_anonymous_vpn.asInstanceOf[js.Any])
    if (!js.isUndefined(is_hosting_provider)) __obj.updateDynamic("is_hosting_provider")(is_hosting_provider.asInstanceOf[js.Any])
    if (!js.isUndefined(is_public_proxy)) __obj.updateDynamic("is_public_proxy")(is_public_proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(is_tor_exit_node)) __obj.updateDynamic("is_tor_exit_node")(is_tor_exit_node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  def CityResponse(
    city: CityRecord = null,
    continent: ContinentRecord = null,
    country: CountryRecord = null,
    location: LocationRecord = null,
    postal: PostalRecord = null,
    registered_country: RegisteredCountryRecord = null,
    represented_country: RepresentedCountryRecord = null,
    subdivisions: js.Array[SubdivisionsRecord] = null,
    traits: TraitsRecord = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (postal != null) __obj.updateDynamic("postal")(postal.asInstanceOf[js.Any])
    if (registered_country != null) __obj.updateDynamic("registered_country")(registered_country.asInstanceOf[js.Any])
    if (represented_country != null) __obj.updateDynamic("represented_country")(represented_country.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (traits != null) __obj.updateDynamic("traits")(traits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  def CountryResponse(
    continent: ContinentRecord = null,
    country: CountryRecord = null,
    registered_country: RegisteredCountryRecord = null,
    represented_country: RepresentedCountryRecord = null,
    traits: TraitsRecord = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (registered_country != null) __obj.updateDynamic("registered_country")(registered_country.asInstanceOf[js.Any])
    if (represented_country != null) __obj.updateDynamic("represented_country")(represented_country.asInstanceOf[js.Any])
    if (traits != null) __obj.updateDynamic("traits")(traits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  def AsnResponse(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    ip_address: String = null
  ): Response = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any])
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  def ConnectionTypeResponse(connection_type: String, ip_address: String = null): Response = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  def DomainResponse(domain: String, ip_address: String = null): Response = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

