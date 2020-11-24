package typings.onionoo.mod.Onionoo

import typings.onionoo.anon.Accept
import typings.onionoo.onionooStrings.`new in series`
import typings.onionoo.onionooStrings.experimental
import typings.onionoo.onionooStrings.obsolete
import typings.onionoo.onionooStrings.recommended
import typings.onionoo.onionooStrings.unrecommended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relay extends js.Object {
  
  /**
    * Bandwidth in bytes per second that this relay is willing and capable to provide. This bandwidth
    * value is the minimum of `bandwidth_rate`, `bandwidth_burst`, and `observed_bandwidth`.
    * Missing if router descriptor containing this information cannot be found.
    */
  var advertised_bandwidth: js.UndefOr[Double] = js.native
  
  /**
    * Array of fingerprints of relays that are not in an effective, mutual family relationship with this relay.
    * These relays are part of this relay's family but they don't consider this relay to be part of their family.
    * Omitted if empty or if descriptor containing this information cannot be found.
    */
  var alleged_family: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * AS number as found in an AS database by resolving the relay's first onion-routing IP address.
    * AS number strings start with "AS", followed directly by the AS number. Omitted if the relay IP
    * address could not be found in the AS database.
    */
  var as: js.UndefOr[String] = js.native
  
  /**
    * AS name as found in an AS database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the AS database.
    */
  var as_name: js.UndefOr[String] = js.native
  
  /**
    * Bandwidth in bytes per second that this relay is willing to sustain in very short intervals.
    * Missing if router descriptor containing this information cannot be found.
    */
  var bandwidth_burst: js.UndefOr[Double] = js.native
  
  /**
    * Average bandwidth in bytes per second that this relay is willing to sustain over long periods.
    * Missing if router descriptor containing this information cannot be found.
    */
  var bandwidth_rate: js.UndefOr[Double] = js.native
  
  /**
    * City name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a city name.
    */
  var city_name: js.UndefOr[String] = js.native
  
  /**
    * Weight assigned to this relay by the directory authorities that clients use in their path selection algorithm.
    * The unit is arbitrary; currently it's kilobytes per second, but that might change in the future.
    */
  var consensus_weight: Double = js.native
  
  /**
    * Fraction of this relay's consensus weight compared to the sum of all consensus weights in the network.
    * This fraction is a very rough approximation of the probability of this relay to be selected by clients.
    * Omitted if the relay is not running.
    */
  var consensus_weight_fraction: js.UndefOr[Double] = js.native
  
  /**
    * Contact address of the relay operator. Omitted if empty or if descriptor containing this information
    * cannot be found.
    */
  var contact: js.UndefOr[String] = js.native
  
  /**
    * Two-letter lower-case country code as found in a GeoIP database by resolving the relay's first
    * onion-routing IP address. Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * Country name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a country name.
    */
  var country_name: js.UndefOr[String] = js.native
  
  /**
    * IPv4 address and TCP port where the relay accepts directory connections.
    * Omitted if the relay does not accept directory connections.
    */
  var dir_address: js.UndefOr[String] = js.native
  
  /**
    * Array of fingerprints of relays that are in an effective, mutual family relationship with this relay.
    * These relays are part of this relay's family and they consider this relay to be part of their family.
    * Always contains the relay's own fingerprint. Omitted if the descriptor containing this information
    * cannot be found.
    */
  var effective_family: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Array of IPv4 addresses that the relay used to exit to the Internet in the past 24 hours. Omitted if
    * array is empty. Includes all exit addresses, regardless of whether they are used as onion-routing addresses
    * or not.
    */
  var exit_addresses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Array of exit-policy lines. Missing if router descriptor containing this information cannot be found.
    * May contradict the `exit_policy_summary` field in a rare edge case: this happens when the relay changes
    * its exit policy after the directory authorities summarized the previous exit policy.
    */
  var exit_policy: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Summary version of the relay's exit policy containing a dictionary with either an `accept` or a `reject` element.
    * If there is an `accept` (`reject`) element, the relay accepts (rejects) all TCP ports or port ranges
    * in the given list for most IP addresses and rejects (accepts) all other ports. May contradict the
    * `exit_policy` field in a rare edge case: this happens when the relay changes its exit policy after
    * the directory authorities summarized the previous exit policy.
    */
  var exit_policy_summary: js.UndefOr[Accept] = js.native
  
  /**
    * Summary version of the relay's IPv6 exit policy containing a dictionary with either an `accept` or a `reject`
    * element. If there is an `accept` (`reject`) element, the relay accepts (rejects) all TCP ports or port ranges
    * in the given list for most IP addresses and rejects (accepts) all other ports. Missing if the relay rejects
    * all connections to IPv6 addresses. May contradict the `exit_policy_summary` field in a rare edge case:
    * this happens when the relay changes its exit policy after the directory authorities summarized the previous
    * exit policy.
    */
  var exit_policy_v6_summary: js.UndefOr[Accept] = js.native
  
  /**
    * Probability of this relay to be selected for the exit position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var exit_probability: js.UndefOr[Double] = js.native
  
  /**
    * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String = js.native
  
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay was first seen in a network status consensus.
    */
  var first_seen: String = js.native
  
  /**
    * Array of relay flags that the directory authorities assigned to this relay. May be omitted if empty.
    */
  var flags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Probability of this relay to be selected for the guard position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var guard_probability: js.UndefOr[Double] = js.native
  
  /**
    * Boolean field saying whether this relay indicated that it is hibernating in its last known server descriptor.
    * This information may be helpful to decide whether a relay that is not running anymore has reached its
    * accounting limit and has not dropped out of the network for another, unknown reason. Omitted if either
    * the relay is not hibernating, or if no information is available about the hibernation status of the relay.
    */
  var hibernating: js.UndefOr[Boolean] = js.native
  
  /**
    * Host name as found in a reverse DNS lookup of the relay's primary IP address. This field is updated at most
    * once in 12 hours, unless the relay IP address changes. Omitted if the relay IP address was not looked up,
    * if no lookup request was successful yet, or if no A record was found matching the PTR record.
    * @deprecated
    */
  var host_name: js.UndefOr[String] = js.native
  
  /**
    * Array of fingerprints of relays that are not in an effective, mutual family relationship with this relay
    * but that can be reached by following effective, mutual family relationships starting at this relay.
    * Omitted if empty or if descriptor containing this information cannot be found.
    */
  var indirect_family: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay last stopped announcing an IPv4 or IPv6 address or
    * TCP port where it previously accepted onion-routing or directory connections. This timestamp can serve
    * as indicator whether this relay would be a suitable fallback directory.
    */
  var last_changed_address_or_port: String = js.native
  
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the relay was last (re-)started.
    * Missing if router descriptor containing this information cannot be found.
    */
  var last_restarted: js.UndefOr[String] = js.native
  
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay was last seen in a network status consensus.
    */
  var last_seen: String = js.native
  
  /**
    * Latitude as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var latitude: js.UndefOr[Double] = js.native
  
  /**
    * Longitude as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var longitude: js.UndefOr[Double] = js.native
  
  /**
    * Boolean field saying whether the consensus weight of this relay is based on a threshold of 3 or more
    * measurements by Tor bandwidth authorities. Omitted if the network status consensus containing this
    * relay does not contain measurement information.
    */
  var measured: js.UndefOr[Boolean] = js.native
  
  /**
    * Probability of this relay to be selected for the middle position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var middle_probability: js.UndefOr[Double] = js.native
  
  /**
    * Relay nickname consisting of 1–19 alphanumerical characters.
    */
  var nickname: String = js.native
  
  /**
    * Bandwidth estimate in bytes per second of the capacity this relay can handle. The relay remembers
    * the maximum bandwidth sustained output over any ten second period in the past day, and another
    * sustained input. The `observed_bandwidth` value is the lesser of these two numbers. Missing if
    * router descriptor containing this information cannot be found.
    */
  var observed_bandwidth: js.UndefOr[Double] = js.native
  
  /**
    * Array of IPv4 or IPv6 addresses and TCP ports or port lists where the relay accepts onion-routing connections.
    * The first address is the primary onion-routing address that the relay used to register in the network,
    * subsequent addresses are in arbitrary order. IPv6 hex characters are all lower-case.
    */
  var or_addresses: js.Array[String] = js.native
  
  /**
    * Platform string containing operating system and Tor version details. Omitted if empty or if descriptor
    * containing this information cannot be found.
    */
  var platform: js.UndefOr[String] = js.native
  
  /**
    * Boolean field saying whether the Tor software version of this relay is recommended by the directory
    * authorities or not. Uses the relay version in the consensus. Omitted if either the directory authorities
    * did not recommend versions, or the relay did not report which version it runs.
    */
  var recommended_version: js.UndefOr[Boolean] = js.native
  
  /**
    * Region name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a region name.
    */
  var region_name: js.UndefOr[String] = js.native
  
  /**
    * Boolean field saying whether this relay was listed as running in the last relay network status consensus.
    */
  var running: Boolean = js.native
  
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
  var unreachable_or_addresses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Host names as found in a reverse DNS lookup of the relay's primary IP address that for which a matching
    * A record was not found. This field is updated at most once in 12 hours, unless the relay IP address changes.
    * Omitted if the relay IP address was not looked up, if no lookup request was successful yet, or if A records
    * were found matching all PTR records (i.e. it was possible to verify the value of each of the PTR records).
    * A DNSSEC validating resolver is used for these lookups. Failure to validate DNSSEC signatures will prevent
    * those names from appearing in this field.
    */
  var unverified_host_names: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Host names as found in a reverse DNS lookup of the relay's primary IP address for which a matching A record
    * was also found. This field is updated at most once in 12 hours, unless the relay IP address changes.
    * Omitted if the relay IP address was not looked up, if no lookup request was successful yet, or if no
    * A records were found matching the PTR records (i.e. it was not possible to verify the value of any
    * of the PTR records). A DNSSEC validating resolver is used for these lookups. Failure to validate
    * DNSSEC signatures will prevent those names from appearing in this field.
    */
  var verified_host_names: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Tor software version without leading "Tor" as reported by the directory authorities in the "v" line of
    * the consensus. Omitted if either the directory authorities or the relay did not report which version
    * the relay runs or if the relay runs an alternative Tor implementation.
    */
  var version: js.UndefOr[String] = js.native
  
  /**
    * Status of the Tor software version of this relay based on the versions recommended by the directory authorities.
    * Possible version statuses are: `recommended` if a version is listed as recommended; `experimental` if a version
    * is newer than every recommended version; `obsolete` if a version is older than every recommended version;
    * `new in series` if a version has other recommended versions with the same first three components,
    * and the version is newer than all such recommended versions, but it is not newer than every recommended version;
    * `unrecommended` if none of the above conditions hold. Omitted if either the directory authorities did not
    * recommend versions, or the relay did not report which version it runs.
    */
  var version_status: js.UndefOr[recommended | experimental | obsolete | (`new in series`) | unrecommended] = js.native
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
    running: Boolean
  ): Relay = {
    val __obj = js.Dynamic.literal(consensus_weight = consensus_weight.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], first_seen = first_seen.asInstanceOf[js.Any], last_changed_address_or_port = last_changed_address_or_port.asInstanceOf[js.Any], last_seen = last_seen.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], or_addresses = or_addresses.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relay]
  }
  
  @scala.inline
  implicit class RelayOps[Self <: Relay] (val x: Self) extends AnyVal {
    
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
    def setConsensus_weight(value: Double): Self = this.set("consensus_weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_seen(value: String): Self = this.set("first_seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_changed_address_or_port(value: String): Self = this.set("last_changed_address_or_port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_seen(value: String): Self = this.set("last_seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOr_addressesVarargs(value: String*): Self = this.set("or_addresses", js.Array(value :_*))
    
    @scala.inline
    def setOr_addresses(value: js.Array[String]): Self = this.set("or_addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertised_bandwidth(value: Double): Self = this.set("advertised_bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertised_bandwidth: Self = this.set("advertised_bandwidth", js.undefined)
    
    @scala.inline
    def setAlleged_familyVarargs(value: String*): Self = this.set("alleged_family", js.Array(value :_*))
    
    @scala.inline
    def setAlleged_family(value: js.Array[String]): Self = this.set("alleged_family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlleged_family: Self = this.set("alleged_family", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setAs_name(value: String): Self = this.set("as_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs_name: Self = this.set("as_name", js.undefined)
    
    @scala.inline
    def setBandwidth_burst(value: Double): Self = this.set("bandwidth_burst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth_burst: Self = this.set("bandwidth_burst", js.undefined)
    
    @scala.inline
    def setBandwidth_rate(value: Double): Self = this.set("bandwidth_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth_rate: Self = this.set("bandwidth_rate", js.undefined)
    
    @scala.inline
    def setCity_name(value: String): Self = this.set("city_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity_name: Self = this.set("city_name", js.undefined)
    
    @scala.inline
    def setConsensus_weight_fraction(value: Double): Self = this.set("consensus_weight_fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsensus_weight_fraction: Self = this.set("consensus_weight_fraction", js.undefined)
    
    @scala.inline
    def setContact(value: String): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCountry_name(value: String): Self = this.set("country_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry_name: Self = this.set("country_name", js.undefined)
    
    @scala.inline
    def setDir_address(value: String): Self = this.set("dir_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir_address: Self = this.set("dir_address", js.undefined)
    
    @scala.inline
    def setEffective_familyVarargs(value: String*): Self = this.set("effective_family", js.Array(value :_*))
    
    @scala.inline
    def setEffective_family(value: js.Array[String]): Self = this.set("effective_family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffective_family: Self = this.set("effective_family", js.undefined)
    
    @scala.inline
    def setExit_addressesVarargs(value: String*): Self = this.set("exit_addresses", js.Array(value :_*))
    
    @scala.inline
    def setExit_addresses(value: js.Array[String]): Self = this.set("exit_addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit_addresses: Self = this.set("exit_addresses", js.undefined)
    
    @scala.inline
    def setExit_policyVarargs(value: String*): Self = this.set("exit_policy", js.Array(value :_*))
    
    @scala.inline
    def setExit_policy(value: js.Array[String]): Self = this.set("exit_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit_policy: Self = this.set("exit_policy", js.undefined)
    
    @scala.inline
    def setExit_policy_summary(value: Accept): Self = this.set("exit_policy_summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit_policy_summary: Self = this.set("exit_policy_summary", js.undefined)
    
    @scala.inline
    def setExit_policy_v6_summary(value: Accept): Self = this.set("exit_policy_v6_summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit_policy_v6_summary: Self = this.set("exit_policy_v6_summary", js.undefined)
    
    @scala.inline
    def setExit_probability(value: Double): Self = this.set("exit_probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit_probability: Self = this.set("exit_probability", js.undefined)
    
    @scala.inline
    def setFlagsVarargs(value: String*): Self = this.set("flags", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: js.Array[String]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setGuard_probability(value: Double): Self = this.set("guard_probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuard_probability: Self = this.set("guard_probability", js.undefined)
    
    @scala.inline
    def setHibernating(value: Boolean): Self = this.set("hibernating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHibernating: Self = this.set("hibernating", js.undefined)
    
    @scala.inline
    def setHost_name(value: String): Self = this.set("host_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost_name: Self = this.set("host_name", js.undefined)
    
    @scala.inline
    def setIndirect_familyVarargs(value: String*): Self = this.set("indirect_family", js.Array(value :_*))
    
    @scala.inline
    def setIndirect_family(value: js.Array[String]): Self = this.set("indirect_family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndirect_family: Self = this.set("indirect_family", js.undefined)
    
    @scala.inline
    def setLast_restarted(value: String): Self = this.set("last_restarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_restarted: Self = this.set("last_restarted", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setMeasured(value: Boolean): Self = this.set("measured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasured: Self = this.set("measured", js.undefined)
    
    @scala.inline
    def setMiddle_probability(value: Double): Self = this.set("middle_probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddle_probability: Self = this.set("middle_probability", js.undefined)
    
    @scala.inline
    def setObserved_bandwidth(value: Double): Self = this.set("observed_bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserved_bandwidth: Self = this.set("observed_bandwidth", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setRecommended_version(value: Boolean): Self = this.set("recommended_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommended_version: Self = this.set("recommended_version", js.undefined)
    
    @scala.inline
    def setRegion_name(value: String): Self = this.set("region_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion_name: Self = this.set("region_name", js.undefined)
    
    @scala.inline
    def setUnreachable_or_addressesVarargs(value: String*): Self = this.set("unreachable_or_addresses", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable_or_addresses(value: js.Array[String]): Self = this.set("unreachable_or_addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable_or_addresses: Self = this.set("unreachable_or_addresses", js.undefined)
    
    @scala.inline
    def setUnverified_host_namesVarargs(value: String*): Self = this.set("unverified_host_names", js.Array(value :_*))
    
    @scala.inline
    def setUnverified_host_names(value: js.Array[String]): Self = this.set("unverified_host_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnverified_host_names: Self = this.set("unverified_host_names", js.undefined)
    
    @scala.inline
    def setVerified_host_namesVarargs(value: String*): Self = this.set("verified_host_names", js.Array(value :_*))
    
    @scala.inline
    def setVerified_host_names(value: js.Array[String]): Self = this.set("verified_host_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified_host_names: Self = this.set("verified_host_names", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersion_status(value: recommended | experimental | obsolete | (`new in series`) | unrecommended): Self = this.set("version_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion_status: Self = this.set("version_status", js.undefined)
  }
}
