package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bridge extends js.Object {
  /**
    * Bandwidth in bytes per second that this bridge is willing and capable to provide. This bandwidth value
    * is the minimum of `bandwidth_rate`, `bandwidth_burst`, and `observed_bandwidth`.
    * Missing if router descriptor containing this information cannot be found.
    */
  var advertised_bandwidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this bridge was first seen in a bridge network status.
    */
  var first_seen: java.lang.String
  /**
    * Array of relay flags that the bridge authority assigned to this bridge. May be omitted if empty.
    */
  var flags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var hashed_fingerprint: java.lang.String
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the bridge was last (re-)started.
    * Missing if router descriptor containing this information cannot be found.
    */
  var last_restarted: js.UndefOr[java.lang.String] = js.undefined
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this bridge was last seen in a bridge network status.
    */
  var last_seen: java.lang.String
  /**
    * Bridge nickname consisting of 1–19 alphanumerical characters.
    */
  var nickname: java.lang.String
  /**
    * Array of sanitized IPv4 or IPv6 addresses and TCP ports or port lists where the bridge accepts
    * onion-routing connections. The first address is the primary onion-routing address that the bridge used
    * to register in the network, subsequent addresses are in arbitrary order. IPv6 hex characters are all lower-case.
    * Sanitized IP addresses are always in `10/8` or `[fd9f:2e19:3bcf/48]` IP networks and are only useful
    * to learn which IP version the bridge uses and to detect whether the bridge changed its address.
    * Sanitized IP addresses always change on the 1st of every month at 00:00:00 UTC, regardless of the bridge
    * actually changing its IP address. TCP ports are not sanitized.
    */
  var or_addresses: js.Array[java.lang.String]
  /**
    * Platform string containing operating system and Tor version details.
    * Omitted if not provided by the bridge or if descriptor containing this information cannot be found.
    */
  var platform: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean field saying whether the Tor software version of this bridge is recommended by the directory
    * authorities or not. Uses the bridge version in the bridge network status. Omitted if either the directory
    * authorities did not recommend versions, or the bridge did not report which version it runs.
    */
  var recommended_version: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Boolean field saying whether this bridge was listed as running in the last bridge network status.
    */
  var running: scala.Boolean
  /**
    * Array of (pluggable) transport names supported by this bridge.
    */
  var transports: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Tor software version without leading "Tor" as reported by the bridge in the "platform" line of its server
    * descriptor. Omitted if not provided by the bridge, if the descriptor containing this information cannot
    * be found, or if the bridge runs an alternative Tor implementation.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Status of the Tor software version of this bridge based on the versions recommended by the directory authorities.
    * Possible version statuses are: `recommended` if a version is listed as recommended; `experimental` if a
    * version is newer than every recommended version; `obsolete` if a version is older than every recommended version;
    * `new in series` if a version has other recommended versions with the same first three components, and the
    * version is newer than all such recommended versions, but it is not newer than every recommended version;
    * `unrecommended` if none of the above conditions hold. Omitted if either the directory authorities did not
    * recommend versions, or the bridge did not report which version it runs.
    */
  var version_status: js.UndefOr[
    onionooLib.onionooLibStrings.recommended | onionooLib.onionooLibStrings.experimental | onionooLib.onionooLibStrings.obsolete | (onionooLib.onionooLibStrings.`new in series`) | onionooLib.onionooLibStrings.unrecommended
  ] = js.undefined
}

object Bridge {
  @scala.inline
  def apply(
    first_seen: java.lang.String,
    hashed_fingerprint: java.lang.String,
    last_seen: java.lang.String,
    nickname: java.lang.String,
    or_addresses: js.Array[java.lang.String],
    running: scala.Boolean,
    advertised_bandwidth: scala.Int | scala.Double = null,
    flags: js.Array[java.lang.String] = null,
    last_restarted: java.lang.String = null,
    platform: java.lang.String = null,
    recommended_version: js.UndefOr[scala.Boolean] = js.undefined,
    transports: js.Array[java.lang.String] = null,
    version: java.lang.String = null,
    version_status: onionooLib.onionooLibStrings.recommended | onionooLib.onionooLibStrings.experimental | onionooLib.onionooLibStrings.obsolete | (onionooLib.onionooLibStrings.`new in series`) | onionooLib.onionooLibStrings.unrecommended = null
  ): Bridge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("first_seen")(first_seen)
    __obj.updateDynamic("hashed_fingerprint")(hashed_fingerprint)
    __obj.updateDynamic("last_seen")(last_seen)
    __obj.updateDynamic("nickname")(nickname)
    __obj.updateDynamic("or_addresses")(or_addresses)
    __obj.updateDynamic("running")(running)
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

