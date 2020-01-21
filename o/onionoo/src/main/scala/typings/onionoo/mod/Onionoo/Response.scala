package typings.onionoo.mod.Onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[TRelay, TBridge] extends js.Object {
  var bridges: js.Array[TBridge]
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known bridge network status was published.
    * Indicates how recent the bridge objects in this document are.
    */
  var bridges_published: String
  /**
    * Number of skipped bridges as requested by a positive `offset` parameter value. Omitted if zero.
    */
  var bridges_skipped: js.UndefOr[Double] = js.undefined
  /**
    * Number of truncated bridges as requested by a positive `limit` parameter value. Omitted if zero.
    */
  var bridges_truncated: js.UndefOr[Double] = js.undefined
  /**
    * Git revision of the Onionoo instance's software used to write this response, which will be omitted if unknown.
    */
  var build_revision: js.UndefOr[String] = js.undefined
  /**
    * UTC date (YYYY-MM-DD) when the next major protocol version is scheduled to be deployed. Omitted if no major
    * protocol changes are planned.
    */
  var next_major_version_scheduled: js.UndefOr[String] = js.undefined
  var relays: js.Array[TRelay]
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known relay network status consensus started being valid.
    * Indicates how recent the relay objects in this document are.
    */
  var relays_published: String
  /**
    * Number of skipped relays as requested by a positive "offset" parameter value. Omitted if zero.
    */
  var relays_skipped: js.UndefOr[Double] = js.undefined
  /**
    * Number of truncated relays as requested by a positive "limit" parameter value. Omitted if zero.
    */
  var relays_truncated: js.UndefOr[Double] = js.undefined
  /**
    * Onionoo protocol version string.
    */
  var version: String
}

object Response {
  @scala.inline
  def apply[TRelay, TBridge](
    bridges: js.Array[TBridge],
    bridges_published: String,
    relays: js.Array[TRelay],
    relays_published: String,
    version: String,
    bridges_skipped: Int | Double = null,
    bridges_truncated: Int | Double = null,
    build_revision: String = null,
    next_major_version_scheduled: String = null,
    relays_skipped: Int | Double = null,
    relays_truncated: Int | Double = null
  ): Response[TRelay, TBridge] = {
    val __obj = js.Dynamic.literal(bridges = bridges.asInstanceOf[js.Any], bridges_published = bridges_published.asInstanceOf[js.Any], relays = relays.asInstanceOf[js.Any], relays_published = relays_published.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (bridges_skipped != null) __obj.updateDynamic("bridges_skipped")(bridges_skipped.asInstanceOf[js.Any])
    if (bridges_truncated != null) __obj.updateDynamic("bridges_truncated")(bridges_truncated.asInstanceOf[js.Any])
    if (build_revision != null) __obj.updateDynamic("build_revision")(build_revision.asInstanceOf[js.Any])
    if (next_major_version_scheduled != null) __obj.updateDynamic("next_major_version_scheduled")(next_major_version_scheduled.asInstanceOf[js.Any])
    if (relays_skipped != null) __obj.updateDynamic("relays_skipped")(relays_skipped.asInstanceOf[js.Any])
    if (relays_truncated != null) __obj.updateDynamic("relays_truncated")(relays_truncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[TRelay, TBridge]]
  }
}

