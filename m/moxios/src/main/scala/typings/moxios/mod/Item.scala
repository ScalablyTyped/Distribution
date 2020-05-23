package typings.moxios.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var responseText: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    headers: js.Any = null,
    response: js.Any = null,
    responseText: String = null,
    status: js.UndefOr[Double] = js.undefined,
    statusText: String = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (responseText != null) __obj.updateDynamic("responseText")(responseText.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

