package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnswerPreCheckoutQueryOptions extends js.Object {
  var error_message: js.UndefOr[String] = js.undefined
}

object AnswerPreCheckoutQueryOptions {
  @scala.inline
  def apply(error_message: String = null): AnswerPreCheckoutQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[AnswerPreCheckoutQueryOptions]
  }
}

