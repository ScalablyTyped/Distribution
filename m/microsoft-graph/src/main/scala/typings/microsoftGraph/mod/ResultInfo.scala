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
  def apply(code: Int | Double = null, message: String = null, subcode: Int | Double = null): ResultInfo = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (subcode != null) __obj.updateDynamic("subcode")(subcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultInfo]
  }
}

