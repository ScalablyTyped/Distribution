package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.venue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultVenue
  extends InlineQueryResultLocationBase
     with InlineQueryResult {
  var address: String
  var foursquare_id: js.UndefOr[String] = js.undefined
  var `type`: venue
}

object InlineQueryResultVenue {
  @scala.inline
  def apply(
    address: String,
    id: String,
    latitude: Double,
    longitude: Double,
    title: String,
    `type`: venue,
    foursquare_id: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: js.UndefOr[Double] = js.undefined,
    thumb_url: String = null,
    thumb_width: js.UndefOr[Double] = js.undefined
  ): InlineQueryResultVenue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (foursquare_id != null) __obj.updateDynamic("foursquare_id")(foursquare_id.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb_height)) __obj.updateDynamic("thumb_height")(thumb_height.get.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb_width)) __obj.updateDynamic("thumb_width")(thumb_width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultVenue]
  }
}

