package typings.ngtoaster.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopParams extends IToast {
  var toasterId: js.UndefOr[Double] = js.undefined
}

object IPopParams {
  @scala.inline
  def apply(
    body: String = null,
    bodyOutputType: String = null,
    clickHandler: /* evt */ Event => Unit = null,
    closeHtml: String = null,
    directiveData: js.Any = null,
    onHideCallback: /* toast */ IToast => Unit = null,
    onShowCallback: /* toast */ IToast => Unit = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    title: String = null,
    toastId: String | Double = null,
    toasterId: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): IPopParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyOutputType != null) __obj.updateDynamic("bodyOutputType")(bodyOutputType.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction1(clickHandler))
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml.asInstanceOf[js.Any])
    if (directiveData != null) __obj.updateDynamic("directiveData")(directiveData.asInstanceOf[js.Any])
    if (onHideCallback != null) __obj.updateDynamic("onHideCallback")(js.Any.fromFunction1(onHideCallback))
    if (onShowCallback != null) __obj.updateDynamic("onShowCallback")(js.Any.fromFunction1(onShowCallback))
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toastId != null) __obj.updateDynamic("toastId")(toastId.asInstanceOf[js.Any])
    if (!js.isUndefined(toasterId)) __obj.updateDynamic("toasterId")(toasterId.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopParams]
  }
}

