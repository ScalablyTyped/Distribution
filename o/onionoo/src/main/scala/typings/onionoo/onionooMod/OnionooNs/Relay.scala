package typings.onionoo.onionooMod.OnionooNs

import typings.onionoo.Anon_Accept
import typings.onionoo.onionooStrings.`new in series`
import typings.onionoo.onionooStrings.experimental
import typings.onionoo.onionooStrings.obsolete
import typings.onionoo.onionooStrings.recommended
import typings.onionoo.onionooStrings.unrecommended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relay extends js.Object {
  /**
    * Bandwidth in bytes per second that this relay is willing and capable to provide. This bandwidth
    * value is the minimum of `bandwidth_rate`, `bandwidth_burst`, and `observed_bandwidth`.
    * Missing if router descriptor containing this information cannot be found.
    */
  var advertised_bandwidth: js.UndefOr[Double] = js.undefined
  /**
    * Array of fingerprints of relays that are not in an effective, mutual family relationship with this relay.
    * These relays are part of this relay's family but they don't consider this relay to be part of their family.
    * Omitted if empty or if descriptor containing this information cannot be found.
    */
  var alleged_family: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * AS number as found in an AS database by resolving the relay's first onion-routing IP address.
    * AS number strings start with "AS", followed directly by the AS number. Omitted if the relay IP
    * address could not be found in the AS database.
    */
  var as: js.UndefOr[String] = js.undefined
  /**
    * AS name as found in an AS database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the AS database.
    */
  var as_name: js.UndefOr[String] = js.undefined
  /**
    * Bandwidth in bytes per second that this relay is willing to sustain in very short intervals.
    * Missing if router descriptor containing this information cannot be found.
    */
  var bandwidth_burst: js.UndefOr[Double] = js.undefined
  /**
    * Average bandwidth in bytes per second that this relay is willing to sustain over long periods.
    * Missing if router descriptor containing this information cannot be found.
    */
  var bandwidth_rate: js.UndefOr[Double] = js.undefined
  /**
    * City name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a city name.
    */
  var city_name: js.UndefOr[String] = js.undefined
  /**
    * Weight assigned to this relay by the directory authorities that clients use in their path selection algorithm.
    * The unit is arbitrary; currently it's kilobytes per second, but that might change in the future.
    */
  var consensus_weight: Double
  /**
    * Fraction of this relay's consensus weight compared to the sum of all consensus weights in the network.
    * This fraction is a very rough approximation of the probability of this relay to be selected by clients.
    * Omitted if the relay is not running.
    */
  var consensus_weight_fraction: js.UndefOr[Double] = js.undefined
  /**
    * Contact address of the relay operator. Omitted if empty or if descriptor containing this information
    * cannot be found.
    */
  var contact: js.UndefOr[String] = js.undefined
  /**
    * Two-letter lower-case country code as found in a GeoIP database by resolving the relay's first
    * onion-routing IP address. Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * Country name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a country name.
    */
  var country_name: js.UndefOr[String] = js.undefined
  /**
    * IPv4 address and TCP port where the relay accepts directory connections.
    * Omitted if the relay does not accept directory connections.
    */
  var dir_address: js.UndefOr[String] = js.undefined
  /**
    * Array of fingerprints of relays that are in an effective, mutual family relationship with this relay.
    * These relays are part of this relay's family and they consider this relay to be part of their family.
    * Always contains the relay's own fingerprint. Omitted if the descriptor containing this information
    * cannot be found.
    */
  var effective_family: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Array of IPv4 addresses that the relay used to exit to the Internet in the past 24 hours. Omitted if
    * array is empty. Includes all exit addresses, regardless of whether they are used as onion-routing addresses
    * or not.
    */
  var exit_addresses: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Array of exit-policy lines. Missing if router descriptor containing this information cannot be found.
    * May contradict the `exit_policy_summary` field in a rare edge case: this happens when the relay changes
    * its exit policy after the directory authorities summarized the previous exit policy.
    */
  var exit_policy: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Summary version of the relay's exit policy containing a dictionary with either an `accept` or a `reject` element.
    * If there is an `accept` (`reject`) element, the relay accepts (rejects) all TCP ports or port ranges
    * in the given list for most IP addresses and rejects (accepts) all other ports. May contradict the
    * `exit_policy` field in a rare edge case: this happens when the relay changes its exit policy after
    * the directory authorities summarized the previous exit policy.
    */
  var exit_policy_summary: js.UndefOr[Anon_Accept] = js.undefined
  /**
    * Summary version of the relay's IPv6 exit policy containing a dictionary with either an `accept` or a `reject`
    * element. If there is an `accept` (`reject`) element, the relay accepts (rejects) all TCP ports or port ranges
    * in the given list for most IP addresses and rejects (accepts) all other ports. Missing if the relay rejects
    * all connections to IPv6 addresses. May contradict the `exit_policy_summary` field in a rare edge case:
    * this happens when the relay changes its exit policy after the directory authorities summarized the previous
    * exit policy.
    */
  var exit_policy_v6_summary: js.UndefOr[Anon_Accept] = js.undefined
  /**
    * Probability of this relay to be selected for the exit position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var exit_probability: js.UndefOr[Double] = js.undefined
  /**
    * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay was first seen in a network status consensus.
    */
  var first_seen: String
  /**
    * Array of relay flags that the directory authorities assigned to this relay. May be omitted if empty.
    */
  var flags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Probability of this relay to be selected for the guard position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var guard_probability: js.UndefOr[Double] = js.undefined
  /**
    * Boolean field saying whether this relay indicated that it is hibernating in its last known server descriptor.
    * This information may be helpful to decide whether a relay that is not running anymore has reached its
    * accounting limit and has not dropped out of the network for another, unknown reason. Omitted if either
    * the relay is not hibernating, or if no information is available about the hibernation status of the relay.
    */
  var hibernating: js.UndefOr[Boolean] = js.undefined
  /**
    * Host name as found in a reverse DNS lookup of the relay's primary IP address. This field is updated at most
    * once in 12 hours, unless the relay IP address changes. Omitted if the relay IP address was not looked up,
    * if no lookup request was successful yet, or if no A record was found matching the PTR record.
    * @deprecated
    */
  var host_name: js.UndefOr[String] = js.undefined
  /**
    * Array of fingerprints of relays that are not in an effective, mutual family relationship with this relay
    * but that can be reached by following effective, mutual family relationships starting at this relay.
    * Omitted if empty or if descriptor containing this information cannot be found.
    */
  var indirect_family: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay last stopped announcing an IPv4 or IPv6 address or
    * TCP port where it previously accepted onion-routing or directory connections. This timestamp can serve
    * as indicator whether this relay would be a suitable fallback directory.
    */
  var last_changed_address_or_port: String
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the relay was last (re-)started.
    * Missing if router descriptor containing this information cannot be found.
    */
  var last_restarted: js.UndefOr[String] = js.undefined
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay was last seen in a network status consensus.
    */
  var last_seen: String
  /**
    * Latitude as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
    * Longitude as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var longitude: js.UndefOr[Double] = js.undefined
  /**
    * Boolean field saying whether the consensus weight of this relay is based on a threshold of 3 or more
    * measurements by Tor bandwidth authorities. Omitted if the network status consensus containing this
    * relay does not contain measurement information.
    */
  var measured: js.UndefOr[Boolean] = js.undefined
  /**
    * Probability of this relay to be selected for the middle position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var middle_probability: js.UndefOr[Double] = js.undefined
  /**
    * Relay nickname consisting of 1–19 alphanumerical characters.
    */
  var nickname: String
  /**
    * Bandwidth estimate in bytes per second of the capacity this relay can handle. The relay remembers
    * the maximum bandwidth sustained output over any ten second period in the past day, and another
    * sustained input. The `observed_bandwidth` value is the lesser of these two numbers. Missing if
    * router descriptor containing this information cannot be found.
    */
  var observed_bandwidth: js.UndefOr[Double] = js.undefined
  /**
    * Array of IPv4 or IPv6 addresses and TCP ports or port lists where the relay accepts onion-routing connections.
    * The first address is the primary onion-routing address that the relay used to register in the network,
    * subsequent addresses are in arbitrary order. IPv6 hex characters are all lower-case.
    */
  var or_addresses: js.Array[String]
  /**
    * Platform string containing operating system and Tor version details. Omitted if empty or if descriptor
    * containing this information cannot be found.
    */
  var platform: js.UndefOr[String] = js.undefined
  /**
    * Boolean field saying whether the Tor software version of this relay is recommended by the directory
    * authorities or not. Uses the relay version in the consensus. Omitted if either the directory authorities
    * did not recommend versions, or the relay did not report which version it runs.
    */
  var recommended_version: js.UndefOr[Boolean] = js.undefined
  /**
    * Region name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a region name.
    */
  var region_name: js.UndefOr[String] = js.undefined
  /**
    * Boolean field saying whether this relay was listed as running in the last relay network status consensus.
    */
  var running: Boolean
  /**
    * Array of IPv4 or IPv6 addresses and TCP ports or port lists where the relay claims in its descriptor to
    * accept onion-routing connections but that the directory authorities failed to confirm as reachable.
    * Contains only additional addresses of a relay that are found unreachable and only as long as a minority of
    * directory authorities performs reachability tests on these additional addresses. Relays with an unreachable
    * primary address are not included in the network status consensus and excluded entirely. Likewise, relays
    * with unreachable additional addresses tested by a majority of directory authorities are not included in
    * the network status consensus and excluded here, too. If at any point network status votes will be added
    * to the processing, relays with unreachable addresses will be included here. Addresses are in arbitrary order.
    * IPv6 hex characters are all lower-case. Omitted if empty.
    */
  var unreachable_or_addresses: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Host names as found in a reverse DNS lookup of the relay's primary IP address that for which a matching
    * A record was not found. This field is updated at most once in 12 hours, unless the relay IP address changes.
    * Omitted if the relay IP address was not looked up, if no lookup request was successful yet, or if A records
    * were found matching all PTR records (i.e. it was possible to verify the value of each of the PTR records).
    * A DNSSEC validating resolver is used for these lookups. Failure to validate DNSSEC signatures will prevent
    * those names from appearing in this field.
    */
  var unverified_host_names: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Host names as found in a reverse DNS lookup of the relay's primary IP address for which a matching A record
    * was also found. This field is updated at most once in 12 hours, unless the relay IP address changes.
    * Omitted if the relay IP address was not looked up, if no lookup request was successful yet, or if no
    * A records were found matching the PTR records (i.e. it was not possible to verify the value of any
    * of the PTR records). A DNSSEC validating resolver is used for these lookups. Failure to validate
    * DNSSEC signatures will prevent those names from appearing in this field.
    */
  var verified_host_names: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Tor software version without leading "Tor" as reported by the directory authorities in the "v" line of
    * the consensus. Omitted if either the directory authorities or the relay did not report which version
    * the relay runs or if the relay runs an alternative Tor implementation.
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * Status of the Tor software version of this relay based on the versions recommended by the directory authorities.
    * Possible version statuses are: `recommended` if a version is listed as recommended; `experimental` if a version
    * is newer than every recommended version; `obsolete` if a version is older than every recommended version;
    * `new in series` if a version has other recommended versions with the same first three components,
    * and the version is newer than all such recommended versions, but it is not newer than every recommended version;
    * `unrecommended` if none of the above conditions hold. Omitted if either the directory authorities did not
    * recommend versions, or the relay did not report which version it runs.
    */
  var version_status: js.UndefOr[recommended | experimental | obsolete | (`new in series`) | unrecommended] = js.undefined
}

object Relay {
  @scala.inline
  def apply(
    consensus_weight: Double,
    fingerprint: String,
    first_seen: String,
    last_changed_address_or_port: String,
    last_seen: String,
    nickname: String,
    or_addresses: js.Array[String],
    running: Boolean,
    advertised_bandwidth: Int | Double = null,
    alleged_family: js.Array[String] = null,
    as: String = null,
    as_name: String = null,
    bandwidth_burst: Int | Double = null,
    bandwidth_rate: Int | Double = null,
    city_name: String = null,
    consensus_weight_fraction: Int | Double = null,
    contact: String = null,
    country: String = null,
    country_name: String = null,
    dir_address: String = null,
    effective_family: js.Array[String] = null,
    exit_addresses: js.Array[String] = null,
    exit_policy: js.Array[String] = null,
    exit_policy_summary: Anon_Accept = null,
    exit_policy_v6_summary: Anon_Accept = null,
    exit_probability: Int | Double = null,
    flags: js.Array[String] = null,
    guard_probability: Int | Double = null,
    hibernating: js.UndefOr[Boolean] = js.undefined,
    host_name: String = null,
    indirect_family: js.Array[String] = null,
    last_restarted: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    measured: js.UndefOr[Boolean] = js.undefined,
    middle_probability: Int | Double = null,
    observed_bandwidth: Int | Double = null,
    platform: String = null,
    recommended_version: js.UndefOr[Boolean] = js.undefined,
    region_name: String = null,
    unreachable_or_addresses: js.Array[String] = null,
    unverified_host_names: js.Array[String] = null,
    verified_host_names: js.Array[String] = null,
    version: String = null,
    version_status: recommended | experimental | obsolete | (`new in series`) | unrecommended = null
  ): Relay = {
    val __obj = js.Dynamic.literal(consensus_weight = consensus_weight, fingerprint = fingerprint, first_seen = first_seen, last_changed_address_or_port = last_changed_address_or_port, last_seen = last_seen, nickname = nickname, or_addresses = or_addresses, running = running)
    if (advertised_bandwidth != null) __obj.updateDynamic("advertised_bandwidth")(advertised_bandwidth.asInstanceOf[js.Any])
    if (alleged_family != null) __obj.updateDynamic("alleged_family")(alleged_family)
    if (as != null) __obj.updateDynamic("as")(as)
    if (as_name != null) __obj.updateDynamic("as_name")(as_name)
    if (bandwidth_burst != null) __obj.updateDynamic("bandwidth_burst")(bandwidth_burst.asInstanceOf[js.Any])
    if (bandwidth_rate != null) __obj.updateDynamic("bandwidth_rate")(bandwidth_rate.asInstanceOf[js.Any])
    if (city_name != null) __obj.updateDynamic("city_name")(city_name)
    if (consensus_weight_fraction != null) __obj.updateDynamic("consensus_weight_fraction")(consensus_weight_fraction.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (country != null) __obj.updateDynamic("country")(country)
    if (country_name != null) __obj.updateDynamic("country_name")(country_name)
    if (dir_address != null) __obj.updateDynamic("dir_address")(dir_address)
    if (effective_family != null) __obj.updateDynamic("effective_family")(effective_family)
    if (exit_addresses != null) __obj.updateDynamic("exit_addresses")(exit_addresses)
    if (exit_policy != null) __obj.updateDynamic("exit_policy")(exit_policy)
    if (exit_policy_summary != null) __obj.updateDynamic("exit_policy_summary")(exit_policy_summary)
    if (exit_policy_v6_summary != null) __obj.updateDynamic("exit_policy_v6_summary")(exit_policy_v6_summary)
    if (exit_probability != null) __obj.updateDynamic("exit_probability")(exit_probability.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (guard_probability != null) __obj.updateDynamic("guard_probability")(guard_probability.asInstanceOf[js.Any])
    if (!js.isUndefined(hibernating)) __obj.updateDynamic("hibernating")(hibernating)
    if (host_name != null) __obj.updateDynamic("host_name")(host_name)
    if (indirect_family != null) __obj.updateDynamic("indirect_family")(indirect_family)
    if (last_restarted != null) __obj.updateDynamic("last_restarted")(last_restarted)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (!js.isUndefined(measured)) __obj.updateDynamic("measured")(measured)
    if (middle_probability != null) __obj.updateDynamic("middle_probability")(middle_probability.asInstanceOf[js.Any])
    if (observed_bandwidth != null) __obj.updateDynamic("observed_bandwidth")(observed_bandwidth.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (!js.isUndefined(recommended_version)) __obj.updateDynamic("recommended_version")(recommended_version)
    if (region_name != null) __obj.updateDynamic("region_name")(region_name)
    if (unreachable_or_addresses != null) __obj.updateDynamic("unreachable_or_addresses")(unreachable_or_addresses)
    if (unverified_host_names != null) __obj.updateDynamic("unverified_host_names")(unverified_host_names)
    if (verified_host_names != null) __obj.updateDynamic("verified_host_names")(verified_host_names)
    if (version != null) __obj.updateDynamic("version")(version)
    if (version_status != null) __obj.updateDynamic("version_status")(version_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relay]
  }
}

