package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BotCommand extends js.Object {
  var command: String
  var description: String
}

object BotCommand {
  @scala.inline
  def apply(command: String, description: String): BotCommand = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotCommand]
  }
}

