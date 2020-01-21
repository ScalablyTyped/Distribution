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
  def apply(migrate_to_chat_id: Int | Double = null, retry_after: Int | Double = null): ResponseParameters = {
    val __obj = js.Dynamic.literal()
    if (migrate_to_chat_id != null) __obj.updateDynamic("migrate_to_chat_id")(migrate_to_chat_id.asInstanceOf[js.Any])
    if (retry_after != null) __obj.updateDynamic("retry_after")(retry_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseParameters]
  }
}

