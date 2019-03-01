package typings
package mcustomscrollbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoEnableScrollAmount extends js.Object {
  /**
    * Enable or disable scroll buttons.
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Scroll buttons pixels scrolling amount, value in pixels or "auto"
    */
  var scrollAmount: js.UndefOr[mcustomscrollbarLib.mcustomscrollbarLibStrings.auto | scala.Double] = js.undefined
  /**
    * Define the buttons scrolling type/behavior.
    * scrollType: "stepless" – continuously scroll content while pressing the button (default)
    * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
    */
  var scrollType: js.UndefOr[
    mcustomscrollbarLib.mcustomscrollbarLibStrings.stepless | mcustomscrollbarLib.mcustomscrollbarLibStrings.stepped
  ] = js.undefined
  /**
    * Set a tabindex value for the buttons.
    */
  var tabindex: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AutoEnableScrollAmount {
  @scala.inline
  def apply(
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    scrollAmount: mcustomscrollbarLib.mcustomscrollbarLibStrings.auto | scala.Double = null,
    scrollType: mcustomscrollbarLib.mcustomscrollbarLibStrings.stepless | mcustomscrollbarLib.mcustomscrollbarLibStrings.stepped = null,
    tabindex: scala.Int | scala.Double = null
  ): Anon_AutoEnableScrollAmount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (scrollAmount != null) __obj.updateDynamic("scrollAmount")(scrollAmount.asInstanceOf[js.Any])
    if (scrollType != null) __obj.updateDynamic("scrollType")(scrollType.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoEnableScrollAmount]
  }
}

