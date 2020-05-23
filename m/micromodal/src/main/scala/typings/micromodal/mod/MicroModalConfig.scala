package typings.micromodal.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicroModalConfig extends js.Object {
  /**
    * Set this to true if using css animations to hide the modal. This allows it to wait for the animation to
    * finish before removing it from the DOM. Default is false
    */
  var awaitCloseAnimation: js.UndefOr[Boolean] = js.undefined
  /** Custom data attribute to close modal. Default is data-micromodal-close. */
  var closeTrigger: js.UndefOr[String] = js.undefined
  /** This option suppresses the console warnings if passed as true. The default value is false. */
  var debugMode: js.UndefOr[Boolean] = js.undefined
  /** Disable auto focus on first focusable element. Default is false */
  var disableFocus: js.UndefOr[Boolean] = js.undefined
  /** This disables scrolling on the page while the modal is open. The default value is false. */
  var disableScroll: js.UndefOr[Boolean] = js.undefined
  /** This is fired when the modal is closing. */
  var onClose: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  /** This is fired when the modal is opening. */
  var onShow: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  /** Custom data attribute to open modal. Default is data-micromodal-trigger. */
  var openTrigger: js.UndefOr[String] = js.undefined
}

object MicroModalConfig {
  @scala.inline
  def apply(
    awaitCloseAnimation: js.UndefOr[Boolean] = js.undefined,
    closeTrigger: String = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    disableFocus: js.UndefOr[Boolean] = js.undefined,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    onClose: /* modal */ js.UndefOr[HTMLElement] => Unit = null,
    onShow: /* modal */ js.UndefOr[HTMLElement] => Unit = null,
    openTrigger: String = null
  ): MicroModalConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitCloseAnimation)) __obj.updateDynamic("awaitCloseAnimation")(awaitCloseAnimation.get.asInstanceOf[js.Any])
    if (closeTrigger != null) __obj.updateDynamic("closeTrigger")(closeTrigger.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocus)) __obj.updateDynamic("disableFocus")(disableFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.get.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (openTrigger != null) __obj.updateDynamic("openTrigger")(openTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicroModalConfig]
  }
}

