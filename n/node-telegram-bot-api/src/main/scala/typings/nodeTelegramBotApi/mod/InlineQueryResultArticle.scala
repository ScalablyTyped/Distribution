package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.article
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultArticle
  extends InlineQueryResultBase
     with InlineQueryResult {
  var description: js.UndefOr[String] = js.undefined
  var hide_url: js.UndefOr[Boolean] = js.undefined
  var input_message_content: InputMessageContent
  var thumb_height: js.UndefOr[Double] = js.undefined
  var thumb_url: js.UndefOr[String] = js.undefined
  var thumb_width: js.UndefOr[Double] = js.undefined
  var title: String
  var `type`: article
  var url: js.UndefOr[String] = js.undefined
}

object InlineQueryResultArticle {
  @scala.inline
  def apply(
    id: String,
    input_message_content: InputMessageContent,
    title: String,
    `type`: article,
    description: String = null,
    hide_url: js.UndefOr[Boolean] = js.undefined,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: js.UndefOr[Double] = js.undefined,
    thumb_url: String = null,
    thumb_width: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): InlineQueryResultArticle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input_message_content = input_message_content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(hide_url)) __obj.updateDynamic("hide_url")(hide_url.get.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb_height)) __obj.updateDynamic("thumb_height")(thumb_height.get.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb_width)) __obj.updateDynamic("thumb_width")(thumb_width.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultArticle]
  }
}

