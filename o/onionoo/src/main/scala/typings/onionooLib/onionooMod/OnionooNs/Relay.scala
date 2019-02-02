package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relay extends js.Object {
  /**
    * Bandwidth in bytes per second that this relay is willing and capable to provide. This bandwidth
    * value is the minimum of `bandwidth_rate`, `bandwidth_burst`, and `observed_bandwidth`.
    * Missing if router descriptor containing this information cannot be found.
    */
  var advertised_bandwidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Array of fingerprints of relays that are not in an effective, mutual family relationship with this relay.
    * These relays are part of this relay's family but they don't consider this relay to be part of their family.
    * Omitted if empty or if descriptor containing this information cannot be found.
    */
  var alleged_family: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * AS number as found in an AS database by resolving the relay's first onion-routing IP address.
    * AS number strings start with "AS", followed directly by the AS number. Omitted if the relay IP
    * address could not be found in the AS database.
    */
  var as: js.UndefOr[java.lang.String] = js.undefined
  /**
    * AS name as found in an AS database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the AS database.
    */
  var as_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Bandwidth in bytes per second that this relay is willing to sustain in very short intervals.
    * Missing if router descriptor containing this information cannot be found.
    */
  var bandwidth_burst: js.UndefOr[scala.Double] = js.undefined
  /**
    * Average bandwidth in bytes per second that this relay is willing to sustain over long periods.
    * Missing if router descriptor containing this information cannot be found.
    */
  var bandwidth_rate: js.UndefOr[scala.Double] = js.undefined
  /**
    * City name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a city name.
    */
  var city_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Weight assigned to this relay by the directory authorities that clients use in their path selection algorithm.
    * The unit is arbitrary; currently it's kilobytes per second, but that might change in the future.
    */
  var consensus_weight: scala.Double
  /**
    * Fraction of this relay's consensus weight compared to the sum of all consensus weights in the network.
    * This fraction is a very rough approximation of the probability of this relay to be selected by clients.
    * Omitted if the relay is not running.
    */
  var consensus_weight_fraction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Contact address of the relay operator. Omitted if empty or if descriptor containing this information
    * cannot be found.
    */
  var contact: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Two-letter lower-case country code as found in a GeoIP database by resolving the relay's first
    * onion-routing IP address. Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Country name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a country name.
    */
  var country_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * IPv4 address and TCP port where the relay accepts directory connections.
    * Omitted if the relay does not accept directory connections.
    */
  var dir_address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of fingerprints of relays that are in an effective, mutual family relationship with this relay.
    * These relays are part of this relay's family and they consider this relay to be part of their family.
    * Always contains the relay's own fingerprint. Omitted if the descriptor containing this information
    * cannot be found.
    */
  var effective_family: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Array of IPv4 addresses that the relay used to exit to the Internet in the past 24 hours. Omitted if
    * array is empty. Includes all exit addresses, regardless of whether they are used as onion-routing addresses
    * or not.
    */
  var exit_addresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Array of exit-policy lines. Missing if router descriptor containing this information cannot be found.
    * May contradict the `exit_policy_summary` field in a rare edge case: this happens when the relay changes
    * its exit policy after the directory authorities summarized the previous exit policy.
    */
  var exit_policy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Summary version of the relay's exit policy containing a dictionary with either an `accept` or a `reject` element.
    * If there is an `accept` (`reject`) element, the relay accepts (rejects) all TCP ports or port ranges
    * in the given list for most IP addresses and rejects (accepts) all other ports. May contradict the
    * `exit_policy` field in a rare edge case: this happens when the relay changes its exit policy after
    * the directory authorities summarized the previous exit policy.
    */
  var exit_policy_summary: js.UndefOr[onionooLib.Anon_Accept] = js.undefined
  /**
    * Summary version of the relay's IPv6 exit policy containing a dictionary with either an `accept` or a `reject`
    * element. If there is an `accept` (`reject`) element, the relay accepts (rejects) all TCP ports or port ranges
    * in the given list for most IP addresses and rejects (accepts) all other ports. Missing if the relay rejects
    * all connections to IPv6 addresses. May contradict the `exit_policy_summary` field in a rare edge case:
    * this happens when the relay changes its exit policy after the directory authorities summarized the previous
    * exit policy.
    */
  var exit_policy_v6_summary: js.UndefOr[onionooLib.Anon_Accept] = js.undefined
  /**
    * Probability of this relay to be selected for the exit position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var exit_probability: js.UndefOr[scala.Double] = js.undefined
  /**
    * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: java.lang.String
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay was first seen in a network status consensus.
    */
  var first_seen: java.lang.String
  /**
    * Array of relay flags that the directory authorities assigned to this relay. May be omitted if empty.
    */
  var flags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Probability of this relay to be selected for the guard position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var guard_probability: js.UndefOr[scala.Double] = js.undefined
  /**
    * Boolean field saying whether this relay indicated that it is hibernating in its last known server descriptor.
    * This information may be helpful to decide whether a relay that is not running anymore has reached its
    * accounting limit and has not dropped out of the network for another, unknown reason. Omitted if either
    * the relay is not hibernating, or if no information is available about the hibernation status of the relay.
    */
  var hibernating: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Host name as found in a reverse DNS lookup of the relay's primary IP address. This field is updated at most
    * once in 12 hours, unless the relay IP address changes. Omitted if the relay IP address was not looked up,
    * if no lookup request was successful yet, or if no A record was found matching the PTR record.
    * @deprecated
    */
  var host_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of fingerprints of relays that are not in an effective, mutual family relationship with this relay
    * but that can be reached by following effective, mutual family relationships starting at this relay.
    * Omitted if empty or if descriptor containing this information cannot be found.
    */
  var indirect_family: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay last stopped announcing an IPv4 or IPv6 address or
    * TCP port where it previously accepted onion-routing or directory connections. This timestamp can serve
    * as indicator whether this relay would be a suitable fallback directory.
    */
  var last_changed_address_or_port: java.lang.String
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the relay was last (re-)started.
    * Missing if router descriptor containing this information cannot be found.
    */
  var last_restarted: js.UndefOr[java.lang.String] = js.undefined
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay was last seen in a network status consensus.
    */
  var last_seen: java.lang.String
  /**
    * Latitude as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * Longitude as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * Boolean field saying whether the consensus weight of this relay is based on a threshold of 3 or more
    * measurements by Tor bandwidth authorities. Omitted if the network status consensus containing this
    * relay does not contain measurement information.
    */
  var measured: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Probability of this relay to be selected for the middle position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var middle_probability: js.UndefOr[scala.Double] = js.undefined
  /**
    * Relay nickname consisting of 1–19 alphanumerical characters.
    */
  var nickname: java.lang.String
  /**
    * Bandwidth estimate in bytes per second of the capacity this relay can handle. The relay remembers
    * the maximum bandwidth sustained output over any ten second period in the past day, and another
    * sustained input. The `observed_bandwidth` value is the lesser of these two numbers. Missing if
    * router descriptor containing this information cannot be found.
    */
  var observed_bandwidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Array of IPv4 or IPv6 addresses and TCP ports or port lists where the relay accepts onion-routing connections.
    * The first address is the primary onion-routing address that the relay used to register in the network,
    * subsequent addresses are in arbitrary order. IPv6 hex characters are all lower-case.
    */
  var or_addresses: js.Array[java.lang.String]
  /**
    * Platform string containing operating system and Tor version details. Omitted if empty or if descriptor
    * containing this information cannot be found.
    */
  var platform: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean field saying whether the Tor software version of this relay is recommended by the directory
    * authorities or not. Uses the relay version in the consensus. Omitted if either the directory authorities
    * did not recommend versions, or the relay did not report which version it runs.
    */
  var recommended_version: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Region name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a region name.
    */
  var region_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean field saying whether this relay was listed as running in the last relay network status consensus.
    */
  var running: scala.Boolean
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
  var unreachable_or_addresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Host names as found in a reverse DNS lookup of the relay's primary IP address that for which a matching
    * A record was not found. This field is updated at most once in 12 hours, unless the relay IP address changes.
    * Omitted if the relay IP address was not looked up, if no lookup request was successful yet, or if A records
    * were found matching all PTR records (i.e. it was possible to verify the value of each of the PTR records).
    * A DNSSEC validating resolver is used for these lookups. Failure to validate DNSSEC signatures will prevent
    * those names from appearing in this field.
    */
  var unverified_host_names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Host names as found in a reverse DNS lookup of the relay's primary IP address for which a matching A record
    * was also found. This field is updated at most once in 12 hours, unless the relay IP address changes.
    * Omitted if the relay IP address was not looked up, if no lookup request was successful yet, or if no
    * A records were found matching the PTR records (i.e. it was not possible to verify the value of any
    * of the PTR records). A DNSSEC validating resolver is used for these lookups. Failure to validate
    * DNSSEC signatures will prevent those names from appearing in this field.
    */
  var verified_host_names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Tor software version without leading "Tor" as reported by the directory authorities in the "v" line of
    * the consensus. Omitted if either the directory authorities or the relay did not report which version
    * the relay runs or if the relay runs an alternative Tor implementation.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Status of the Tor software version of this relay based on the versions recommended by the directory authorities.
    * Possible version statuses are: `recommended` if a version is listed as recommended; `experimental` if a version
    * is newer than every recommended version; `obsolete` if a version is older than every recommended version;
    * `new in series` if a version has other recommended versions with the same first three components,
    * and the version is newer than all such recommended versions, but it is not newer than every recommended version;
    * `unrecommended` if none of the above conditions hold. Omitted if either the directory authorities did not
    * recommend versions, or the relay did not report which version it runs.
    */
  var version_status: js.UndefOr[
    onionooLib.onionooLibStrings.recommended | onionooLib.onionooLibStrings.experimental | onionooLib.onionooLibStrings.obsolete | (onionooLib.onionooLibStrings.`new in series`) | onionooLib.onionooLibStrings.unrecommended
  ] = js.undefined
}

