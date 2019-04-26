package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInit extends js.Object {
  var headers: js.UndefOr[HeadersInit] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
}

object ResponseInit {
  @scala.inline
  def apply(
    url: java.lang.String,
    headers: HeadersInit = null,
    size: scala.Int | scala.Double = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): ResponseInit = {
    val __obj = js.Dynamic.literal(url = url)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInit]
  }
}

