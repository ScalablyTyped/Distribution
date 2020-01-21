package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUpdatesOptions extends js.Object {
  var allowed_updates: js.UndefOr[js.Array[String]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object GetUpdatesOptions {
  @scala.inline
  def apply(
    allowed_updates: js.Array[String] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    timeout: Int | Double = null
  ): GetUpdatesOptions = {
    val __obj = js.Dynamic.literal()
    if (allowed_updates != null) __obj.updateDynamic("allowed_updates")(allowed_updates.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpdatesOptions]
  }
}

