package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnswerInlineQueryOptions extends js.Object {
  var cache_time: js.UndefOr[Double] = js.undefined
  var is_personal: js.UndefOr[Boolean] = js.undefined
  var next_offset: js.UndefOr[String] = js.undefined
  var switch_pm_parameter: js.UndefOr[String] = js.undefined
  var switch_pm_text: js.UndefOr[String] = js.undefined
}

object AnswerInlineQueryOptions {
  @scala.inline
  def apply(
    cache_time: js.UndefOr[Double] = js.undefined,
    is_personal: js.UndefOr[Boolean] = js.undefined,
    next_offset: String = null,
    switch_pm_parameter: String = null,
    switch_pm_text: String = null
  ): AnswerInlineQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache_time)) __obj.updateDynamic("cache_time")(cache_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_personal)) __obj.updateDynamic("is_personal")(is_personal.get.asInstanceOf[js.Any])
    if (next_offset != null) __obj.updateDynamic("next_offset")(next_offset.asInstanceOf[js.Any])
    if (switch_pm_parameter != null) __obj.updateDynamic("switch_pm_parameter")(switch_pm_parameter.asInstanceOf[js.Any])
    if (switch_pm_text != null) __obj.updateDynamic("switch_pm_text")(switch_pm_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerInlineQueryOptions]
  }
}

