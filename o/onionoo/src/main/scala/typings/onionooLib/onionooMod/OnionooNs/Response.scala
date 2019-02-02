package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[TRelay, TBridge] extends js.Object {
  var bridges: js.Array[TBridge]
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known bridge network status was published.
    * Indicates how recent the bridge objects in this document are.
    */
  var bridges_published: java.lang.String
  /**
    * Number of skipped bridges as requested by a positive `offset` parameter value. Omitted if zero.
    */
  var bridges_skipped: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of truncated bridges as requested by a positive `limit` parameter value. Omitted if zero.
    */
  var bridges_truncated: js.UndefOr[scala.Double] = js.undefined
  /**
    * Git revision of the Onionoo instance's software used to write this response, which will be omitted if unknown.
    */
  var build_revision: js.UndefOr[java.lang.String] = js.undefined
  /**
    * UTC date (YYYY-MM-DD) when the next major protocol version is scheduled to be deployed. Omitted if no major
    * protocol changes are planned.
    */
  var next_major_version_scheduled: js.UndefOr[java.lang.String] = js.undefined
  var relays: js.Array[TRelay]
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known relay network status consensus started being valid.
    * Indicates how recent the relay objects in this document are.
    */
  var relays_published: java.lang.String
  /**
    * Number of skipped relays as requested by a positive "offset" parameter value. Omitted if zero.
    */
  var relays_skipped: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of truncated relays as requested by a positive "limit" parameter value. Omitted if zero.
    */
  var relays_truncated: js.UndefOr[scala.Double] = js.undefined
  /**
    * Onionoo protocol version string.
    */
  var version: java.lang.String
}

