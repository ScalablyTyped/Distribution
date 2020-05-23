package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseParameters extends js.Object {
  var migrate_to_chat_id: js.UndefOr[Double] = js.undefined
  var retry_after: js.UndefOr[Double] = js.undefined
}

object ResponseParameters {
  @scala.inline
  def apply(
    migrate_to_chat_id: js.UndefOr[Double] = js.undefined,
    retry_after: js.UndefOr[Double] = js.undefined
  ): ResponseParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(migrate_to_chat_id)) __obj.updateDynamic("migrate_to_chat_id")(migrate_to_chat_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_after)) __obj.updateDynamic("retry_after")(retry_after.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseParameters]
  }
}

