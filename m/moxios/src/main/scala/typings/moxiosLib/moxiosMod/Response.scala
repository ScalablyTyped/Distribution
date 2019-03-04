package typings
package moxiosLib.moxiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var config: axiosLib.axiosMod.AxiosRequestConfig
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.Any
  var request: Request
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    config: axiosLib.axiosMod.AxiosRequestConfig,
    headers: js.Any,
    request: Request,
    code: java.lang.String = null,
    data: js.Any = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null
  ): Response = {
    val __obj = js.Dynamic.literal(config = config, headers = headers, request = request)
    if (code != null) __obj.updateDynamic("code")(code)
    if (data != null) __obj.updateDynamic("data")(data)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Response]
  }
}

