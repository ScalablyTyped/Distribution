package typings.ngbootbox

import typings.bootbox.BootboxButtonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgBootboxDialog extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var backdrop: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[BootboxButtonMap] = js.undefined
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var onEscape: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NgBootboxDialog {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    buttons: BootboxButtonMap = null,
    callback: () => _ = null,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    message: String = null,
    onEscape: () => _ | Boolean = null,
    show: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    templateUrl: String = null,
    title: String = null
  ): NgBootboxDialog = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onEscape != null) __obj.updateDynamic("onEscape")(js.Any.fromFunction0(onEscape))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgBootboxDialog]
  }
}

