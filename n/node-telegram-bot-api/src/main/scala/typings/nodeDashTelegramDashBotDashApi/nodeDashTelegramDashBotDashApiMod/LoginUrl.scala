package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginUrl extends js.Object {
  var bot_username: js.UndefOr[String] = js.undefined
  var forward_text: js.UndefOr[String] = js.undefined
  var request_write_acces: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object LoginUrl {
  @scala.inline
  def apply(
    url: String,
    bot_username: String = null,
    forward_text: String = null,
    request_write_acces: js.UndefOr[Boolean] = js.undefined
  ): LoginUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (bot_username != null) __obj.updateDynamic("bot_username")(bot_username.asInstanceOf[js.Any])
    if (forward_text != null) __obj.updateDynamic("forward_text")(forward_text.asInstanceOf[js.Any])
    if (!js.isUndefined(request_write_acces)) __obj.updateDynamic("request_write_acces")(request_write_acces.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginUrl]
  }
}

