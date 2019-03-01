package typings
package moxiosLib.moxiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var responseText: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    headers: js.Any = null,
    response: js.Any = null,
    responseText: java.lang.String = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseText != null) __obj.updateDynamic("responseText")(responseText)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Item]
  }
}

