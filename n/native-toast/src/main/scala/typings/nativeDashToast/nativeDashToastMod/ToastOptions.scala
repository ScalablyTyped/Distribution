package typings.nativeDashToast.nativeDashToastMod

import typings.nativeDashToast.nativeDashToastStrings.`north-east`
import typings.nativeDashToast.nativeDashToastStrings.`north-west`
import typings.nativeDashToast.nativeDashToastStrings.`south-east`
import typings.nativeDashToast.nativeDashToastStrings.`south-west`
import typings.nativeDashToast.nativeDashToastStrings.center
import typings.nativeDashToast.nativeDashToastStrings.east
import typings.nativeDashToast.nativeDashToastStrings.error
import typings.nativeDashToast.nativeDashToastStrings.info
import typings.nativeDashToast.nativeDashToastStrings.north
import typings.nativeDashToast.nativeDashToastStrings.south
import typings.nativeDashToast.nativeDashToastStrings.success
import typings.nativeDashToast.nativeDashToastStrings.warning
import typings.nativeDashToast.nativeDashToastStrings.west
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends js.Object {
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var edge: js.UndefOr[Boolean] = js.undefined
  var el: js.UndefOr[HTMLElement] = js.undefined
  var elements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
  var icon: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[
    center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east`
  ] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[success | warning | info | error] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    edge: js.UndefOr[Boolean] = js.undefined,
    el: HTMLElement = null,
    elements: js.Array[HTMLElement] = null,
    icon: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    position: center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east` = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    `type`: success | warning | info | error = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(edge)) __obj.updateDynamic("edge")(edge)
    if (el != null) __obj.updateDynamic("el")(el)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (message != null) __obj.updateDynamic("message")(message)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
}

