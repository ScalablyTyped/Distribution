package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.typing
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_photo
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.record_video
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_video
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.record_audio
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_audio
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_document
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.find_location
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.record_video_note
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_video_note
*/
trait ChatAction extends js.Object

object ChatAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def find_location: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.find_location = this.cast("find_location")
  @scala.inline
  def record_audio: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.record_audio = this.cast("record_audio")
  @scala.inline
  def record_video: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.record_video = this.cast("record_video")
  @scala.inline
  def record_video_note: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.record_video_note = this.cast("record_video_note")
  @scala.inline
  def typing: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.typing = this.cast("typing")
  @scala.inline
  def upload_audio: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_audio = this.cast("upload_audio")
  @scala.inline
  def upload_document: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_document = this.cast("upload_document")
  @scala.inline
  def upload_photo: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_photo = this.cast("upload_photo")
  @scala.inline
  def upload_video: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_video = this.cast("upload_video")
  @scala.inline
  def upload_video_note: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.upload_video_note = this.cast("upload_video_note")
}

