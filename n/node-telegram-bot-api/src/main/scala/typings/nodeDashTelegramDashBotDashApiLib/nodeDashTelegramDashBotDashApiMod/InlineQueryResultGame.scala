package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultGame
  extends InlineQueryResultBase
     with InlineQueryResult {
  var game_short_name: java.lang.String
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.game
}

object InlineQueryResultGame {
  @scala.inline
  def apply(
    game_short_name: java.lang.String,
    id: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.game,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResultGame = {
    val __obj = js.Dynamic.literal(game_short_name = game_short_name, id = id)
    __obj.updateDynamic("type")(`type`)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[InlineQueryResultGame]
  }
}

