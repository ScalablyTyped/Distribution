package typings.nodeSlack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var channel_id: js.UndefOr[String] = js.undefined
  var channel_name: js.UndefOr[String] = js.undefined
  var team_id: js.UndefOr[String] = js.undefined
  var text: String
  var timestamp: js.UndefOr[Double] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
  var user_name: js.UndefOr[String] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    text: String,
    channel_id: String = null,
    channel_name: String = null,
    team_id: String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    token: String = null,
    user_id: String = null,
    user_name: String = null
  ): Query = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (channel_id != null) __obj.updateDynamic("channel_id")(channel_id.asInstanceOf[js.Any])
    if (channel_name != null) __obj.updateDynamic("channel_name")(channel_name.asInstanceOf[js.Any])
    if (team_id != null) __obj.updateDynamic("team_id")(team_id.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    if (user_name != null) __obj.updateDynamic("user_name")(user_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

