package typings.openstackDashWrapper.openstackDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOption extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var json: js.UndefOr[js.Any] = js.undefined
  var metricLogger: js.UndefOr[js.Any] = js.undefined
  var metricRequestID: js.UndefOr[String] = js.undefined
  var metricUserName: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[js.Any] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object RequestOption {
  @scala.inline
  def apply(
    headers: js.Any = null,
    json: js.Any = null,
    metricLogger: js.Any = null,
    metricRequestID: String = null,
    metricUserName: String = null,
    timeout: js.Any = null,
    uri: String = null
  ): RequestOption = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (json != null) __obj.updateDynamic("json")(json)
    if (metricLogger != null) __obj.updateDynamic("metricLogger")(metricLogger)
    if (metricRequestID != null) __obj.updateDynamic("metricRequestID")(metricRequestID)
    if (metricUserName != null) __obj.updateDynamic("metricUserName")(metricUserName)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[RequestOption]
  }
}

