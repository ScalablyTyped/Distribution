package typings.ngtoaster.ngtoasterMod

import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToast extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var bodyOutputType: js.UndefOr[String] = js.undefined
  var clickHandler: js.UndefOr[EventListener] = js.undefined
  var closeHtml: js.UndefOr[String] = js.undefined
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
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var tapToDismiss: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toastId: js.UndefOr[String | Double] = js.undefined
  /**
    * Acceptable types are:
    * 'error', 'info', 'wait', 'success', and 'warning'
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object IToast {
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
    `type`: String = null
  ): IToast = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyOutputType != null) __obj.updateDynamic("bodyOutputType")(bodyOutputType.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction1(clickHandler))
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml.asInstanceOf[js.Any])
    if (directiveData != null) __obj.updateDynamic("directiveData")(directiveData.asInstanceOf[js.Any])
    if (onHideCallback != null) __obj.updateDynamic("onHideCallback")(js.Any.fromFunction1(onHideCallback))
    if (onShowCallback != null) __obj.updateDynamic("onShowCallback")(js.Any.fromFunction1(onShowCallback))
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toastId != null) __obj.updateDynamic("toastId")(toastId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToast]
  }
}

