package typings.onionoo.mod.Onionoo

import typings.onionoo.onionooStrings.`new in series`
import typings.onionoo.onionooStrings.experimental
import typings.onionoo.onionooStrings.obsolete
import typings.onionoo.onionooStrings.recommended
import typings.onionoo.onionooStrings.unrecommended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bridge extends js.Object {
  /**
    * Bandwidth in bytes per second that this bridge is willing and capable to provide. This bandwidth value
    * is the minimum of `bandwidth_rate`, `bandwidth_burst`, and `observed_bandwidth`.
    * Missing if router descriptor containing this information cannot be found.
    */
  var advertised_bandwidth: js.UndefOr[Double] = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this bridge was first seen in a bridge network status.
    */
  var first_seen: String = js.native
  /**
    * Array of relay flags that the bridge authority assigned to this bridge. May be omitted if empty.
    */
  var flags: js.UndefOr[js.Array[String]] = js.native
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var hashed_fingerprint: String = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the bridge was last (re-)started.
    * Missing if router descriptor containing this information cannot be found.
    */
  var last_restarted: js.UndefOr[String] = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this bridge was last seen in a bridge network status.
    */
  var last_seen: String = js.native
  /**
    * Bridge nickname consisting of 1–19 alphanumerical characters.
    */
  var nickname: String = js.native
  /**
    * Array of sanitized IPv4 or IPv6 addresses and TCP ports or port lists where the bridge accepts
    * onion-routing connections. The first address is the primary onion-routing address that the bridge used
    * to register in the network, subsequent addresses are in arbitrary order. IPv6 hex characters are all lower-case.
    * Sanitized IP addresses are always in `10/8` or `[fd9f:2e19:3bcf/48]` IP networks and are only useful
    * to learn which IP version the bridge uses and to detect whether the bridge changed its address.
    * Sanitized IP addresses always change on the 1st of every month at 00:00:00 UTC, regardless of the bridge
    * actually changing its IP address. TCP ports are not sanitized.
    */
  var or_addresses: js.Array[String] = js.native
  /**
    * Platform string containing operating system and Tor version details.
    * Omitted if not provided by the bridge or if descriptor containing this information cannot be found.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Boolean field saying whether the Tor software version of this bridge is recommended by the directory
    * authorities or not. Uses the bridge version in the bridge network status. Omitted if either the directory
    * authorities did not recommend versions, or the bridge did not report which version it runs.
    */
  var recommended_version: js.UndefOr[Boolean] = js.native
  /**
    * Boolean field saying whether this bridge was listed as running in the last bridge network status.
    */
  var running: Boolean = js.native
  /**
    * Array of (pluggable) transport names supported by this bridge.
    */
  var transports: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tor software version without leading "Tor" as reported by the bridge in the "platform" line of its server
    * descriptor. Omitted if not provided by the bridge, if the descriptor containing this information cannot
    * be found, or if the bridge runs an alternative Tor implementation.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * Status of the Tor software version of this bridge based on the versions recommended by the directory authorities.
    * Possible version statuses are: `recommended` if a version is listed as recommended; `experimental` if a
    * version is newer than every recommended version; `obsolete` if a version is older than every recommended version;
    * `new in series` if a version has other recommended versions with the same first three components, and the
    * version is newer than all such recommended versions, but it is not newer than every recommended version;
    * `unrecommended` if none of the above conditions hold. Omitted if either the directory authorities did not
    * recommend versions, or the bridge did not report which version it runs.
    */
  var version_status: js.UndefOr[recommended | experimental | obsolete | (`new in series`) | unrecommended] = js.native
}

object Bridge {
  @scala.inline
  def apply(
    first_seen: String,
    hashed_fingerprint: String,
    last_seen: String,
    nickname: String,
    or_addresses: js.Array[String],
    running: Boolean
  ): Bridge = {
    val __obj = js.Dynamic.literal(first_seen = first_seen.asInstanceOf[js.Any], hashed_fingerprint = hashed_fingerprint.asInstanceOf[js.Any], last_seen = last_seen.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], or_addresses = or_addresses.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  @scala.inline
  implicit class BridgeOps[Self <: Bridge] (val x: Self) extends AnyVal {
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
    def setFirst_seen(value: String): Self = this.set("first_seen", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashed_fingerprint(value: String): Self = this.set("hashed_fingerprint", value.asInstanceOf[js.Any])
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
    def setFlagsVarargs(value: String*): Self = this.set("flags", js.Array(value :_*))
    @scala.inline
    def setFlags(value: js.Array[String]): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setLast_restarted(value: String): Self = this.set("last_restarted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_restarted: Self = this.set("last_restarted", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setRecommended_version(value: Boolean): Self = this.set("recommended_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommended_version: Self = this.set("recommended_version", js.undefined)
    @scala.inline
    def setTransportsVarargs(value: String*): Self = this.set("transports", js.Array(value :_*))
    @scala.inline
    def setTransports(value: js.Array[String]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
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

