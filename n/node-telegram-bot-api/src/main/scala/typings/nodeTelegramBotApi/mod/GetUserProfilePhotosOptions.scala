package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserProfilePhotosOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
}

object GetUserProfilePhotosOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined): GetUserProfilePhotosOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserProfilePhotosOptions]
  }
}

