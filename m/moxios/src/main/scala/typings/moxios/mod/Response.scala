package typings.moxios.mod

import typings.axios.mod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var config: AxiosRequestConfig
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.Any
  var request: Request
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    config: AxiosRequestConfig,
    headers: js.Any,
    request: Request,
    code: String = null,
    data: js.Any = null,
    status: Int | Double = null,
    statusText: String = null
  ): Response = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

