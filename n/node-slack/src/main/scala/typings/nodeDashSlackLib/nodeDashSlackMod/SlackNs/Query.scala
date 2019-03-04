package typings
package nodeDashSlackLib.nodeDashSlackMod.SlackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var channel_id: js.UndefOr[java.lang.String] = js.undefined
  var channel_name: js.UndefOr[java.lang.String] = js.undefined
  var team_id: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var user_id: js.UndefOr[java.lang.String] = js.undefined
  var user_name: js.UndefOr[java.lang.String] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    text: java.lang.String,
    channel_id: java.lang.String = null,
    channel_name: java.lang.String = null,
    team_id: java.lang.String = null,
    timestamp: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    user_id: java.lang.String = null,
    user_name: java.lang.String = null
  ): Query = {
    val __obj = js.Dynamic.literal(text = text)
    if (channel_id != null) __obj.updateDynamic("channel_id")(channel_id)
    if (channel_name != null) __obj.updateDynamic("channel_name")(channel_name)
    if (team_id != null) __obj.updateDynamic("team_id")(team_id)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    if (user_name != null) __obj.updateDynamic("user_name")(user_name)
    __obj.asInstanceOf[Query]
  }
}

