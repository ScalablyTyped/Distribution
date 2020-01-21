package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.`private`
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.group
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.supergroup
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.channel
*/
trait ChatType extends js.Object

object ChatType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def channel: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.channel = this.cast("channel")
  @scala.inline
  def group: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.group = this.cast("group")
  @scala.inline
  def `private`: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.`private` = this.cast("private")
  @scala.inline
  def supergroup: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.supergroup = this.cast("supergroup")
}

