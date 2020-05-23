package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultInfo extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var subcode: js.UndefOr[Double] = js.undefined
}

object ResultInfo {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    message: String = null,
    subcode: js.UndefOr[Double] = js.undefined
  ): ResultInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(subcode)) __obj.updateDynamic("subcode")(subcode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultInfo]
  }
}

