package typings.mcustomscrollbar.anon

import typings.mcustomscrollbar.mcustomscrollbarStrings.auto
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepless
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enable extends js.Object {
  /**
    * Enable or disable content scrolling via keyboard.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Set the keyboard arrows scrolling amount (in pixels). 
    * The default value "auto" adjusts scrolling amount according to scrollable content length.
    */
  var scrollAmount: js.UndefOr[auto | Double] = js.native
  /**
    * Define the buttons scrolling type/behavior.
    * scrollType: "stepless" – continuously scroll content while pressing the button (default)
    * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
    */
  var scrollType: js.UndefOr[stepless | stepped] = js.native
}

object Enable {
  @scala.inline
  def apply(): Enable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enable]
  }
  @scala.inline
  implicit class EnableOps[Self <: Enable] (val x: Self) extends AnyVal {
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
  }
  
}

