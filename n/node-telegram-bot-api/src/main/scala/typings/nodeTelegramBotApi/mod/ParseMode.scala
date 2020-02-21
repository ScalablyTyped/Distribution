package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.Markdown
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.MarkdownV2
  - typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.HTML
*/
trait ParseMode extends js.Object

object ParseMode {
  @scala.inline
  def HTML: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.HTML = this.cast("HTML")
  @scala.inline
  def Markdown: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.Markdown = this.cast("Markdown")
  @scala.inline
  def MarkdownV2: typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.MarkdownV2 = this.cast("MarkdownV2")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

