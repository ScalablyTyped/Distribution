package typings.micromodal.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicroModalConfig extends js.Object {
  /**
    * Set this to true if using css animations to hide the modal. This allows it to wait for the animation to
    * finish before removing it from the DOM. Default is false
    */
  var awaitCloseAnimation: js.UndefOr[Boolean] = js.native
  /** Custom data attribute to close modal. Default is data-micromodal-close. */
  var closeTrigger: js.UndefOr[String] = js.native
  /** This option suppresses the console warnings if passed as true. The default value is false. */
  var debugMode: js.UndefOr[Boolean] = js.native
  /** Disable auto focus on first focusable element. Default is false */
  var disableFocus: js.UndefOr[Boolean] = js.native
  /** This disables scrolling on the page while the modal is open. The default value is false. */
  var disableScroll: js.UndefOr[Boolean] = js.native
  /** This is fired when the modal is closing. */
  var onClose: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.native
  /** This is fired when the modal is opening. */
  var onShow: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.native
  /** Custom data attribute to open modal. Default is data-micromodal-trigger. */
  var openTrigger: js.UndefOr[String] = js.native
}

object MicroModalConfig {
  @scala.inline
  def apply(): MicroModalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicroModalConfig]
  }
  @scala.inline
  implicit class MicroModalConfigOps[Self <: MicroModalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwaitCloseAnimation(value: Boolean): Self = this.set("awaitCloseAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwaitCloseAnimation: Self = this.set("awaitCloseAnimation", js.undefined)
    @scala.inline
    def setCloseTrigger(value: String): Self = this.set("closeTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseTrigger: Self = this.set("closeTrigger", js.undefined)
    @scala.inline
    def setDebugMode(value: Boolean): Self = this.set("debugMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugMode: Self = this.set("debugMode", js.undefined)
    @scala.inline
    def setDisableFocus(value: Boolean): Self = this.set("disableFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFocus: Self = this.set("disableFocus", js.undefined)
    @scala.inline
    def setDisableScroll(value: Boolean): Self = this.set("disableScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScroll: Self = this.set("disableScroll", js.undefined)
    @scala.inline
    def setOnClose(value: /* modal */ js.UndefOr[HTMLElement] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnShow(value: /* modal */ js.UndefOr[HTMLElement] => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOpenTrigger(value: String): Self = this.set("openTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenTrigger: Self = this.set("openTrigger", js.undefined)
  }
  
}

