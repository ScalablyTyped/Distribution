package typings.nodeDashSlack.nodeDashSlackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var attachments: js.UndefOr[js.Array[_]] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var icon_emoji: js.UndefOr[String] = js.undefined
  var link_names: js.UndefOr[Double] = js.undefined
  var text: String
  var unfurl_links: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    text: String,
    attachments: js.Array[_] = null,
    channel: String = null,
    icon_emoji: String = null,
    link_names: Int | Double = null,
    unfurl_links: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): Message = {
    val __obj = js.Dynamic.literal(text = text)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (icon_emoji != null) __obj.updateDynamic("icon_emoji")(icon_emoji)
    if (link_names != null) __obj.updateDynamic("link_names")(link_names.asInstanceOf[js.Any])
    if (!js.isUndefined(unfurl_links)) __obj.updateDynamic("unfurl_links")(unfurl_links)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Message]
  }
}

