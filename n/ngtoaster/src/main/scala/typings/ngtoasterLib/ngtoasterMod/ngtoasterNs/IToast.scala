package typings
package ngtoasterLib.ngtoasterMod.ngtoasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToast extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var bodyOutputType: js.UndefOr[java.lang.String] = js.undefined
  var clickHandler: js.UndefOr[stdLib.EventListener] = js.undefined
  var closeHtml: js.UndefOr[java.lang.String] = js.undefined
  var directiveData: js.UndefOr[js.Any] = js.undefined
  /**
    * Called when the toast has been removed.
    * @param toast the displayed toast
    */
  var onHideCallback: js.UndefOr[IToastCallback] = js.undefined
  /**
    * Called when the toast has been displayed.
    * @param toast the displayed toast
    */
  var onShowCallback: js.UndefOr[IToastCallback] = js.undefined
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  var tapToDismiss: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var toastId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Acceptable types are:
    * 'error', 'info', 'wait', 'success', and 'warning'
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IToast {
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
    `type`: java.lang.String = null
  ): IToast = {
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
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IToast]
  }
}

