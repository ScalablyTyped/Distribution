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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait InlineQueryResult extends StObject
object InlineQueryResult {
  
  @scala.inline
  def InlineQueryResultArticle(id: String, input_message_content: InputMessageContent, title: String, `type`: article): typings.nodeTelegramBotApi.mod.InlineQueryResultArticle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input_message_content = input_message_content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultArticle]
  }
  
  @scala.inline
  def InlineQueryResultAudio(audio_url: String, id: String, title: String, `type`: audio): typings.nodeTelegramBotApi.mod.InlineQueryResultAudio = {
    val __obj = js.Dynamic.literal(audio_url = audio_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultAudio]
  }
  
  @scala.inline
  def InlineQueryResultCachedAudio(audio_file_id: String, id: String, `type`: audio): typings.nodeTelegramBotApi.mod.InlineQueryResultCachedAudio = {
    val __obj = js.Dynamic.literal(audio_file_id = audio_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultCachedAudio]
  }
  
  @scala.inline
  def InlineQueryResultCachedDocument(document_file_id: String, id: String, title: String, `type`: document): typings.nodeTelegramBotApi.mod.InlineQueryResultCachedDocument = {
    val __obj = js.Dynamic.literal(document_file_id = document_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultCachedDocument]
  }
  
  @scala.inline
  def InlineQueryResultCachedGif(gif_file_id: String, id: String, `type`: gif): typings.nodeTelegramBotApi.mod.InlineQueryResultCachedGif = {
    val __obj = js.Dynamic.literal(gif_file_id = gif_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultCachedGif]
  }
  
  @scala.inline
  def InlineQueryResultCachedMpeg4Gif(id: String, mpeg4_file_id: String, `type`: mpeg4_gif): typings.nodeTelegramBotApi.mod.InlineQueryResultCachedMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_file_id = mpeg4_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultCachedMpeg4Gif]
  }
  
  @scala.inline
  def InlineQueryResultCachedPhoto(id: String, photo_file_id: String, `type`: photo): typings.nodeTelegramBotApi.mod.InlineQueryResultCachedPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_file_id = photo_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultCachedPhoto]
  }
  
  @scala.inline
  def InlineQueryResultCachedSticker(id: String, sticker_file_id: String, `type`: sticker): typings.nodeTelegramBotApi.mod.InlineQueryResultCachedSticker = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sticker_file_id = sticker_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultCachedSticker]
  }
  
  @scala.inline
  def InlineQueryResultCachedVideo(id: String, title: String, `type`: video, video_file_id: String): typings.nodeTelegramBotApi.mod.InlineQueryResultCachedVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_file_id = video_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultCachedVideo]
  }
  
  @scala.inline
  def InlineQueryResultCachedVoice(id: String, title: String, `type`: voice, voice_file_id: String): typings.nodeTelegramBotApi.mod.InlineQueryResultCachedVoice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_file_id = voice_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultCachedVoice]
  }
  
  @scala.inline
  def InlineQueryResultContact(first_name: String, id: String, phone_number: String, `type`: contact): typings.nodeTelegramBotApi.mod.InlineQueryResultContact = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultContact]
  }
  
  @scala.inline
  def InlineQueryResultDocument(document_url: String, id: String, mime_type: String, title: String, `type`: document): typings.nodeTelegramBotApi.mod.InlineQueryResultDocument = {
    val __obj = js.Dynamic.literal(document_url = document_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultDocument]
  }
  
  @scala.inline
  def InlineQueryResultGame(game_short_name: String, id: String, `type`: game): typings.nodeTelegramBotApi.mod.InlineQueryResultGame = {
    val __obj = js.Dynamic.literal(game_short_name = game_short_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultGame]
  }
  
  @scala.inline
  def InlineQueryResultGif(gif_url: String, id: String, `type`: gif): typings.nodeTelegramBotApi.mod.InlineQueryResultGif = {
    val __obj = js.Dynamic.literal(gif_url = gif_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultGif]
  }
  
  @scala.inline
  def InlineQueryResultLocation(id: String, latitude: Double, longitude: Double, title: String, `type`: location): typings.nodeTelegramBotApi.mod.InlineQueryResultLocation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultLocation]
  }
  
  @scala.inline
  def InlineQueryResultMpeg4Gif(id: String, mpeg4_url: String, `type`: mpeg4_gif): typings.nodeTelegramBotApi.mod.InlineQueryResultMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_url = mpeg4_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultMpeg4Gif]
  }
  
  @scala.inline
  def InlineQueryResultPhoto(id: String, photo_url: String, thumb_url: String, `type`: photo): typings.nodeTelegramBotApi.mod.InlineQueryResultPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_url = photo_url.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultPhoto]
  }
  
  @scala.inline
  def InlineQueryResultVenue(address: String, id: String, latitude: Double, longitude: Double, title: String, `type`: venue): typings.nodeTelegramBotApi.mod.InlineQueryResultVenue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultVenue]
  }
  
  @scala.inline
  def InlineQueryResultVideo(id: String, mime_type: String, thumb_url: String, title: String, `type`: video, video_url: String): typings.nodeTelegramBotApi.mod.InlineQueryResultVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_url = video_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultVideo]
  }
  
  @scala.inline
  def InlineQueryResultVoice(id: String, title: String, `type`: voice, voice_url: String): typings.nodeTelegramBotApi.mod.InlineQueryResultVoice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InlineQueryResultVoice]
  }
}
