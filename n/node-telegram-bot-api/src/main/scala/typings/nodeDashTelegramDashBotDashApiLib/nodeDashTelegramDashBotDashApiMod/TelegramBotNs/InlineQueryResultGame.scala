package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("game_short_name")(game_short_name)
    __obj.updateDynamic("id")(id)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[InlineQueryResultGame]
  }
}

