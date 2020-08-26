package typings.mcustomscrollbar.anon

import typings.mcustomscrollbar.mcustomscrollbarStrings.auto
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepless
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollAmount extends js.Object {
  /**
    * Enable or disable scroll buttons.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Scroll buttons pixels scrolling amount, value in pixels or "auto"
    */
  var scrollAmount: js.UndefOr[auto | Double] = js.native
  /**
    * Define the buttons scrolling type/behavior.
    * scrollType: "stepless" – continuously scroll content while pressing the button (default)
    * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
    */
  var scrollType: js.UndefOr[stepless | stepped] = js.native
  /**
    * Set a tabindex value for the buttons.
    */
  var tabindex: js.UndefOr[Double] = js.native
}

object ScrollAmount {
  @scala.inline
  def apply(): ScrollAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollAmount]
  }
  @scala.inline
  implicit class ScrollAmountOps[Self <: ScrollAmount] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setScrollAmount(value: auto | Double): Self = this.set("scrollAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollAmount: Self = this.set("scrollAmount", js.undefined)
    @scala.inline
    def setScrollType(value: stepless | stepped): Self = this.set("scrollType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollType: Self = this.set("scrollType", js.undefined)
    @scala.inline
    def setTabindex(value: Double): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
  }
  
}

