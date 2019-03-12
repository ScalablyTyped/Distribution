package typings
package ngbootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgBootboxDialog extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var backdrop: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[bootboxLib.BootboxButtonMap] = js.undefined
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var onEscape: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object NgBootboxDialog {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: bootboxLib.BootboxButtonMap = null,
    callback: () => _ = null,
    className: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    message: java.lang.String = null,
    onEscape: () => _ | scala.Boolean = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    templateUrl: java.lang.String = null,
    title: java.lang.String = null
  ): NgBootboxDialog = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (message != null) __obj.updateDynamic("message")(message)
    if (onEscape != null) __obj.updateDynamic("onEscape")(js.Any.fromFunction0(onEscape))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (size != null) __obj.updateDynamic("size")(size)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NgBootboxDialog]
  }
}

