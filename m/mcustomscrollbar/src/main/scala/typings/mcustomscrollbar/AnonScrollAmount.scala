package typings.mcustomscrollbar

import typings.mcustomscrollbar.mcustomscrollbarStrings.auto
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepless
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScrollAmount extends js.Object {
  /**
    * Enable or disable scroll buttons.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /**
    * Scroll buttons pixels scrolling amount, value in pixels or "auto"
    */
  var scrollAmount: js.UndefOr[auto | Double] = js.undefined
  /**
    * Define the buttons scrolling type/behavior.
    * scrollType: "stepless" – continuously scroll content while pressing the button (default)
    * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
    */
  var scrollType: js.UndefOr[stepless | stepped] = js.undefined
  /**
    * Set a tabindex value for the buttons.
    */
  var tabindex: js.UndefOr[Double] = js.undefined
}

object AnonScrollAmount {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    scrollAmount: auto | Double = null,
    scrollType: stepless | stepped = null,
    tabindex: Int | Double = null
  ): AnonScrollAmount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (scrollAmount != null) __obj.updateDynamic("scrollAmount")(scrollAmount.asInstanceOf[js.Any])
    if (scrollType != null) __obj.updateDynamic("scrollType")(scrollType.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScrollAmount]
  }
}

