package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ trait InputTextMessageContent extends js.Object {
  var disable_web_page_preview: js.UndefOr[Boolean] = js.undefined
  var message_text: String
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}

object InputTextMessageContent {
  @scala.inline
  def apply(
    message_text: String,
    disable_web_page_preview: js.UndefOr[Boolean] = js.undefined,
    parse_mode: ParseMode = null
  ): InputTextMessageContent = {
    val __obj = js.Dynamic.literal(message_text = message_text.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_web_page_preview)) __obj.updateDynamic("disable_web_page_preview")(disable_web_page_preview.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTextMessageContent]
  }
}

