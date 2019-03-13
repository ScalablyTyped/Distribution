package typings
package nativeDashToastLib.nativeDashToastMod.toastNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends js.Object {
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var edge: js.UndefOr[scala.Boolean] = js.undefined
  var el: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var elements: js.UndefOr[js.Array[stdLib.HTMLElement]] = js.undefined
  var icon: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[
    nativeDashToastLib.nativeDashToastLibStrings.center | nativeDashToastLib.nativeDashToastLibStrings.west | nativeDashToastLib.nativeDashToastLibStrings.east | nativeDashToastLib.nativeDashToastLibStrings.south | nativeDashToastLib.nativeDashToastLibStrings.`south-west` | nativeDashToastLib.nativeDashToastLibStrings.`south-east` | nativeDashToastLib.nativeDashToastLibStrings.north | nativeDashToastLib.nativeDashToastLibStrings.`north-west` | nativeDashToastLib.nativeDashToastLibStrings.`north-east`
  ] = js.undefined
  var rounded: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[
    nativeDashToastLib.nativeDashToastLibStrings.success | nativeDashToastLib.nativeDashToastLibStrings.warning | nativeDashToastLib.nativeDashToastLibStrings.info | nativeDashToastLib.nativeDashToastLibStrings.error
  ] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    edge: js.UndefOr[scala.Boolean] = js.undefined,
    el: stdLib.HTMLElement = null,
    elements: js.Array[stdLib.HTMLElement] = null,
    icon: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    position: nativeDashToastLib.nativeDashToastLibStrings.center | nativeDashToastLib.nativeDashToastLibStrings.west | nativeDashToastLib.nativeDashToastLibStrings.east | nativeDashToastLib.nativeDashToastLibStrings.south | nativeDashToastLib.nativeDashToastLibStrings.`south-west` | nativeDashToastLib.nativeDashToastLibStrings.`south-east` | nativeDashToastLib.nativeDashToastLibStrings.north | nativeDashToastLib.nativeDashToastLibStrings.`north-west` | nativeDashToastLib.nativeDashToastLibStrings.`north-east` = null,
    rounded: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    `type`: nativeDashToastLib.nativeDashToastLibStrings.success | nativeDashToastLib.nativeDashToastLibStrings.warning | nativeDashToastLib.nativeDashToastLibStrings.info | nativeDashToastLib.nativeDashToastLibStrings.error = null
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

