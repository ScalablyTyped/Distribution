package typings
package nodeDashSlackLib.nodeDashSlackMod.SlackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var attachments: js.UndefOr[js.Array[_]] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var icon_emoji: js.UndefOr[java.lang.String] = js.undefined
  var link_names: js.UndefOr[scala.Double] = js.undefined
  var text: java.lang.String
  var unfurl_links: js.UndefOr[scala.Boolean] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    text: java.lang.String,
    attachments: js.Array[_] = null,
    channel: java.lang.String = null,
    icon_emoji: java.lang.String = null,
    link_names: scala.Int | scala.Double = null,
    unfurl_links: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (icon_emoji != null) __obj.updateDynamic("icon_emoji")(icon_emoji)
    if (link_names != null) __obj.updateDynamic("link_names")(link_names.asInstanceOf[js.Any])
    if (!js.isUndefined(unfurl_links)) __obj.updateDynamic("unfurl_links")(unfurl_links)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Message]
  }
}

