package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultArticle
  extends InlineQueryResultBase
     with InlineQueryResult {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var hide_url: js.UndefOr[scala.Boolean] = js.undefined
  var input_message_content: InputMessageContent
  var thumb_height: js.UndefOr[scala.Double] = js.undefined
  var thumb_url: js.UndefOr[java.lang.String] = js.undefined
  var thumb_width: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.article
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object InlineQueryResultArticle {
  @scala.inline
  def apply(
    id: java.lang.String,
    input_message_content: InputMessageContent,
    title: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.article,
    description: java.lang.String = null,
    hide_url: js.UndefOr[scala.Boolean] = js.undefined,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: scala.Int | scala.Double = null,
    thumb_url: java.lang.String = null,
    thumb_width: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): InlineQueryResultArticle = {
    val __obj = js.Dynamic.literal(id = id, input_message_content = input_message_content, title = title)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(hide_url)) __obj.updateDynamic("hide_url")(hide_url)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url)
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[InlineQueryResultArticle]
  }
}

