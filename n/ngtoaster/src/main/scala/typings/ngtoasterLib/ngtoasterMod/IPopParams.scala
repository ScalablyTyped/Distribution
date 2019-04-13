package typings
package ngtoasterLib.ngtoasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopParams extends IToast {
  var toasterId: js.UndefOr[scala.Double] = js.undefined
}

object IPopParams {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    bodyOutputType: java.lang.String = null,
    clickHandler: stdLib.EventListener = null,
    closeHtml: java.lang.String = null,
    directiveData: js.Any = null,
    onHideCallback: IToastCallback = null,
    onShowCallback: IToastCallback = null,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    toastId: java.lang.String | scala.Double = null,
    toasterId: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): IPopParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (bodyOutputType != null) __obj.updateDynamic("bodyOutputType")(bodyOutputType)
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(clickHandler)
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml)
    if (directiveData != null) __obj.updateDynamic("directiveData")(directiveData)
    if (onHideCallback != null) __obj.updateDynamic("onHideCallback")(onHideCallback)
    if (onShowCallback != null) __obj.updateDynamic("onShowCallback")(onShowCallback)
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

