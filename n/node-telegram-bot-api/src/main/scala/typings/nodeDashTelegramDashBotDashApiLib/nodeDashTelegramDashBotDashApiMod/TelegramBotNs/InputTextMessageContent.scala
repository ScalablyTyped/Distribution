package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ trait InputTextMessageContent extends js.Object {
  var disable_web_page_preview: js.UndefOr[scala.Boolean] = js.undefined
  var message_text: java.lang.String
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}

object InputTextMessageContent {
  @scala.inline
  def apply(
    message_text: java.lang.String,
    disable_web_page_preview: js.UndefOr[scala.Boolean] = js.undefined,
    parse_mode: ParseMode = null
  ): InputTextMessageContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message_text")(message_text)
    if (!js.isUndefined(disable_web_page_preview)) __obj.updateDynamic("disable_web_page_preview")(disable_web_page_preview)
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode)
    __obj.asInstanceOf[InputTextMessageContent]
  }
}

