package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.article
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.audio
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.contact
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.document
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.game
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.gif
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.location
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.mpeg4_gif
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.sticker
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.venue
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.voice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.mod.InlineQueryResultCachedAudio
  - typings.nodeTelegramBotApi.mod.InlineQueryResultCachedDocument
  - typings.nodeTelegramBotApi.mod.InlineQueryResultCachedGif
  - typings.nodeTelegramBotApi.mod.InlineQueryResultCachedMpeg4Gif
  - typings.nodeTelegramBotApi.mod.InlineQueryResultCachedPhoto
  - typings.nodeTelegramBotApi.mod.InlineQueryResultCachedSticker
  - typings.nodeTelegramBotApi.mod.InlineQueryResultCachedVideo
  - typings.nodeTelegramBotApi.mod.InlineQueryResultCachedVoice
  - typings.nodeTelegramBotApi.mod.InlineQueryResultArticle
  - typings.nodeTelegramBotApi.mod.InlineQueryResultAudio
  - typings.nodeTelegramBotApi.mod.InlineQueryResultContact
  - typings.nodeTelegramBotApi.mod.InlineQueryResultGame
  - typings.nodeTelegramBotApi.mod.InlineQueryResultDocument
  - typings.nodeTelegramBotApi.mod.InlineQueryResultGif
  - typings.nodeTelegramBotApi.mod.InlineQueryResultLocation
  - typings.nodeTelegramBotApi.mod.InlineQueryResultMpeg4Gif
  - typings.nodeTelegramBotApi.mod.InlineQueryResultPhoto
  - typings.nodeTelegramBotApi.mod.InlineQueryResultVenue
  - typings.nodeTelegramBotApi.mod.InlineQueryResultVideo
  - typings.nodeTelegramBotApi.mod.InlineQueryResultVoice
*/
trait InlineQueryResult extends js.Object

object InlineQueryResult {
  @scala.inline
  def InlineQueryResultCachedDocument(
    document_file_id: String,
    id: String,
    title: String,
    `type`: document,
    caption: String = null,
    description: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(document_file_id = document_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultGif(
    gif_url: String,
    id: String,
    `type`: gif,
    caption: String = null,
    gif_duration: Int | Double = null,
    gif_height: Int | Double = null,
    gif_width: Int | Double = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_url: String = null,
    title: String = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(gif_url = gif_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (gif_duration != null) __obj.updateDynamic("gif_duration")(gif_duration.asInstanceOf[js.Any])
    if (gif_height != null) __obj.updateDynamic("gif_height")(gif_height.asInstanceOf[js.Any])
    if (gif_width != null) __obj.updateDynamic("gif_width")(gif_width.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultPhoto(
    id: String,
    photo_url: String,
    thumb_url: String,
    `type`: photo,
    caption: String = null,
    description: String = null,
    input_message_content: InputMessageContent = null,
    photo_height: Int | Double = null,
    photo_width: Int | Double = null,
    reply_markup: InlineKeyboardMarkup = null,
    title: String = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_url = photo_url.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (photo_height != null) __obj.updateDynamic("photo_height")(photo_height.asInstanceOf[js.Any])
    if (photo_width != null) __obj.updateDynamic("photo_width")(photo_width.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultCachedVoice(
    id: String,
    title: String,
    `type`: voice,
    voice_file_id: String,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_file_id = voice_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultVideo(
    id: String,
    mime_type: String,
    thumb_url: String,
    title: String,
    `type`: video,
    video_url: String,
    caption: String = null,
    description: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    video_duration: Int | Double = null,
    video_height: Int | Double = null,
    video_width: Int | Double = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_url = video_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_height != null) __obj.updateDynamic("video_height")(video_height.asInstanceOf[js.Any])
    if (video_width != null) __obj.updateDynamic("video_width")(video_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultVenue(
    address: String,
    id: String,
    latitude: Double,
    longitude: Double,
    title: String,
    `type`: venue,
    foursquare_id: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: Int | Double = null,
    thumb_url: String = null,
    thumb_width: Int | Double = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (foursquare_id != null) __obj.updateDynamic("foursquare_id")(foursquare_id.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultGame(game_short_name: String, id: String, `type`: game, reply_markup: InlineKeyboardMarkup = null): InlineQueryResult = {
    val __obj = js.Dynamic.literal(game_short_name = game_short_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultDocument(
    document_url: String,
    id: String,
    mime_type: String,
    title: String,
    `type`: document,
    caption: String = null,
    description: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: Int | Double = null,
    thumb_url: String = null,
    thumb_width: Int | Double = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(document_url = document_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultCachedGif(
    gif_file_id: String,
    id: String,
    `type`: gif,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    title: String = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(gif_file_id = gif_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultArticle(
    id: String,
    input_message_content: InputMessageContent,
    title: String,
    `type`: article,
    description: String = null,
    hide_url: js.UndefOr[Boolean] = js.undefined,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: Int | Double = null,
    thumb_url: String = null,
    thumb_width: Int | Double = null,
    url: String = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input_message_content = input_message_content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(hide_url)) __obj.updateDynamic("hide_url")(hide_url.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultContact(
    first_name: String,
    id: String,
    phone_number: String,
    `type`: contact,
    input_message_content: InputMessageContent = null,
    last_name: String = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: Int | Double = null,
    thumb_url: String = null,
    thumb_width: Int | Double = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultCachedVideo(
    id: String,
    title: String,
    `type`: video,
    video_file_id: String,
    caption: String = null,
    description: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_file_id = video_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultCachedMpeg4Gif(
    id: String,
    mpeg4_file_id: String,
    `type`: mpeg4_gif,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    title: String = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_file_id = mpeg4_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultMpeg4Gif(
    id: String,
    mpeg4_url: String,
    `type`: mpeg4_gif,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    mpeg4_duration: Int | Double = null,
    mpeg4_height: Int | Double = null,
    mpeg4_width: Int | Double = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_url: String = null,
    title: String = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_url = mpeg4_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (mpeg4_duration != null) __obj.updateDynamic("mpeg4_duration")(mpeg4_duration.asInstanceOf[js.Any])
    if (mpeg4_height != null) __obj.updateDynamic("mpeg4_height")(mpeg4_height.asInstanceOf[js.Any])
    if (mpeg4_width != null) __obj.updateDynamic("mpeg4_width")(mpeg4_width.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultCachedPhoto(
    id: String,
    photo_file_id: String,
    `type`: photo,
    caption: String = null,
    description: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    title: String = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_file_id = photo_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultCachedAudio(
    audio_file_id: String,
    id: String,
    `type`: audio,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(audio_file_id = audio_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultAudio(
    audio_url: String,
    id: String,
    title: String,
    `type`: audio,
    audio_duration: Int | Double = null,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    performer: String = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(audio_url = audio_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (audio_duration != null) __obj.updateDynamic("audio_duration")(audio_duration.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultLocation(
    id: String,
    latitude: Double,
    longitude: Double,
    title: String,
    `type`: location,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: Int | Double = null,
    thumb_url: String = null,
    thumb_width: Int | Double = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultVoice(
    id: String,
    title: String,
    `type`: voice,
    voice_url: String,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    voice_duration: Int | Double = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (voice_duration != null) __obj.updateDynamic("voice_duration")(voice_duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
  @scala.inline
  def InlineQueryResultCachedSticker(
    id: String,
    sticker_file_id: String,
    `type`: sticker,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sticker_file_id = sticker_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResult]
  }
}

