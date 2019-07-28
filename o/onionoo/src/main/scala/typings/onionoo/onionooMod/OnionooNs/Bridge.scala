package typings.onionoo.onionooMod.OnionooNs

import typings.onionoo.onionooStrings.`new in series`
import typings.onionoo.onionooStrings.experimental
import typings.onionoo.onionooStrings.obsolete
import typings.onionoo.onionooStrings.recommended
import typings.onionoo.onionooStrings.unrecommended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bridge extends js.Object {
  /**
    * Bandwidth in bytes per second that this bridge is willing and capable to provide. This bandwidth value
    * is the minimum of `bandwidth_rate`, `bandwidth_burst`, and `observed_bandwidth`.
    * Missing if router descriptor containing this information cannot be found.
    */
  var advertised_bandwidth: js.UndefOr[Double] = js.undefined
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this bridge was first seen in a bridge network status.
    */
  var first_seen: String
  /**
    * Array of relay flags that the bridge authority assigned to this bridge. May be omitted if empty.
    */
  var flags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var hashed_fingerprint: String
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the bridge was last (re-)started.
    * Missing if router descriptor containing this information cannot be found.
    */
  var last_restarted: js.UndefOr[String] = js.undefined
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this bridge was last seen in a bridge network status.
    */
  var last_seen: String
  /**
    * Bridge nickname consisting of 1–19 alphanumerical characters.
    */
  var nickname: String
  /**
    * Array of sanitized IPv4 or IPv6 addresses and TCP ports or port lists where the bridge accepts
    * onion-routing connections. The first address is the primary onion-routing address that the bridge used
    * to register in the network, subsequent addresses are in arbitrary order. IPv6 hex characters are all lower-case.
    * Sanitized IP addresses are always in `10/8` or `[fd9f:2e19:3bcf/48]` IP networks and are only useful
    * to learn which IP version the bridge uses and to detect whether the bridge changed its address.
    * Sanitized IP addresses always change on the 1st of every month at 00:00:00 UTC, regardless of the bridge
    * actually changing its IP address. TCP ports are not sanitized.
    */
  var or_addresses: js.Array[String]
  /**
    * Platform string containing operating system and Tor version details.
    * Omitted if not provided by the bridge or if descriptor containing this information cannot be found.
    */
  var platform: js.UndefOr[String] = js.undefined
  /**
    * Boolean field saying whether the Tor software version of this bridge is recommended by the directory
    * authorities or not. Uses the bridge version in the bridge network status. Omitted if either the directory
    * authorities did not recommend versions, or the bridge did not report which version it runs.
    */
  var recommended_version: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean field saying whether this bridge was listed as running in the last bridge network status.
    */
  var running: Boolean
  /**
    * Array of (pluggable) transport names supported by this bridge.
    */
  var transports: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Tor software version without leading "Tor" as reported by the bridge in the "platform" line of its server
    * descriptor. Omitted if not provided by the bridge, if the descriptor containing this information cannot
    * be found, or if the bridge runs an alternative Tor implementation.
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * Status of the Tor software version of this bridge based on the versions recommended by the directory authorities.
    * Possible version statuses are: `recommended` if a version is listed as recommended; `experimental` if a
    * version is newer than every recommended version; `obsolete` if a version is older than every recommended version;
    * `new in series` if a version has other recommended versions with the same first three components, and the
    * version is newer than all such recommended versions, but it is not newer than every recommended version;
    * `unrecommended` if none of the above conditions hold. Omitted if either the directory authorities did not
    * recommend versions, or the bridge did not report which version it runs.
    */
  var version_status: js.UndefOr[recommended | experimental | obsolete | (`new in series`) | unrecommended] = js.undefined
}

object Bridge {
  @scala.inline
  def apply(
    first_seen: String,
    hashed_fingerprint: String,
    last_seen: String,
    nickname: String,
    or_addresses: js.Array[String],
    running: Boolean,
    advertised_bandwidth: Int | Double = null,
    flags: js.Array[String] = null,
    last_restarted: String = null,
    platform: String = null,
    recommended_version: js.UndefOr[Boolean] = js.undefined,
    transports: js.Array[String] = null,
    version: String = null,
    version_status: recommended | experimental | obsolete | (`new in series`) | unrecommended = null
  ): Bridge = {
    val __obj = js.Dynamic.literal(first_seen = first_seen, hashed_fingerprint = hashed_fingerprint, last_seen = last_seen, nickname = nickname, or_addresses = or_addresses, running = running)
    if (advertised_bandwidth != null) __obj.updateDynamic("advertised_bandwidth")(advertised_bandwidth.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (last_restarted != null) __obj.updateDynamic("last_restarted")(last_restarted)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (!js.isUndefined(recommended_version)) __obj.updateDynamic("recommended_version")(recommended_version)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    if (version != null) __obj.updateDynamic("version")(version)
    if (version_status != null) __obj.updateDynamic("version_status")(version_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
}

