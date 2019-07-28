package typings.mcustomscrollbar

import typings.mcustomscrollbar.mcustomscrollbarStrings.auto
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepless
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoEnable extends js.Object {
  /**
    * Enable or disable content scrolling via keyboard.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the keyboard arrows scrolling amount (in pixels). 
    * The default value "auto" adjusts scrolling amount according to scrollable content length.
    */
  var scrollAmount: js.UndefOr[auto | Double] = js.undefined
  /**
    * Define the buttons scrolling type/behavior.
    * scrollType: "stepless" – continuously scroll content while pressing the button (default)
    * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
    */
  var scrollType: js.UndefOr[stepless | stepped] = js.undefined
}

object Anon_AutoEnable {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    scrollAmount: auto | Double = null,
    scrollType: stepless | stepped = null
  ): Anon_AutoEnable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (scrollAmount != null) __obj.updateDynamic("scrollAmount")(scrollAmount.asInstanceOf[js.Any])
    if (scrollType != null) __obj.updateDynamic("scrollType")(scrollType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoEnable]
  }
}

