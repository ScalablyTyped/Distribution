package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultGame
  extends InlineQueryResultBase
     with InlineQueryResult {
  var game_short_name: String
  var `type`: game
}

object InlineQueryResultGame {
  @scala.inline
  def apply(game_short_name: String, id: String, `type`: game, reply_markup: InlineKeyboardMarkup = null): InlineQueryResultGame = {
    val __obj = js.Dynamic.literal(game_short_name = game_short_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultGame]
  }
}

