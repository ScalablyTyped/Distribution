package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListArchivesOptions extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var sessionId: js.UndefOr[String] = js.undefined
}

object ListArchivesOptions {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    sessionId: String = null
  ): ListArchivesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArchivesOptions]
  }
}

