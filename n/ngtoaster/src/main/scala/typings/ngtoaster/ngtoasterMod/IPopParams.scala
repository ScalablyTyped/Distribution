package typings.ngtoaster.ngtoasterMod

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
    timeout: Int | Double = null,
    title: String = null,
    toastId: String | Double = null,
    toasterId: Int | Double = null,
    `type`: String = null
  ): IPopParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (bodyOutputType != null) __obj.updateDynamic("bodyOutputType")(bodyOutputType)
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction1(clickHandler))
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml)
    if (directiveData != null) __obj.updateDynamic("directiveData")(directiveData)
    if (onHideCallback != null) __obj.updateDynamic("onHideCallback")(js.Any.fromFunction1(onHideCallback))
    if (onShowCallback != null) __obj.updateDynamic("onShowCallback")(js.Any.fromFunction1(onShowCallback))
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (toastId != null) __obj.updateDynamic("toastId")(toastId.asInstanceOf[js.Any])
    if (toasterId != null) __obj.updateDynamic("toasterId")(toasterId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPopParams]
  }
}

