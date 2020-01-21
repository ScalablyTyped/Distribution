package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.creator
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.administrator
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.member
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.restricted
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.left
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.kicked
*/
trait ChatMemberStatus extends js.Object

object ChatMemberStatus {
  @scala.inline
  def administrator: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.administrator = this.cast("administrator")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def creator: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.creator = this.cast("creator")
  @scala.inline
  def kicked: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.kicked = this.cast("kicked")
  @scala.inline
  def left: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.left = this.cast("left")
  @scala.inline
  def member: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.member = this.cast("member")
  @scala.inline
  def restricted: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.restricted = this.cast("restricted")
}

