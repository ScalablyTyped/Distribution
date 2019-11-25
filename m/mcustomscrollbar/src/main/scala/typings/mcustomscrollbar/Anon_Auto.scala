package typings.mcustomscrollbar

import typings.mcustomscrollbar.mcustomscrollbarStrings.auto
import typings.mcustomscrollbar.mcustomscrollbarStrings.x
import typings.mcustomscrollbar.mcustomscrollbarStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  /**
    * Define the mouse-wheel scrolling axis when both vertical and horizontal scrollbars are present.
    * Set axis: "y" (default) for vertical or axis: "x" for horizontal scrolling.
    */
  var axis: js.UndefOr[x | y] = js.undefined
  /**
    * Set the number of pixels one wheel notch scrolls. The default value “auto” uses the OS/browser value.
    */
  var deltaFactor: js.UndefOr[Double] = js.undefined
  /**
    * Set the tags that disable mouse-wheel when cursor is over them.
    * Default value: ["select","option","keygen","datalist","textarea"]
    */
  var disableOver: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Enable or disable content scrolling via mouse-wheel.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /**
    * Invert mouse-wheel scrolling direction.
    * Set to true to scroll down or right when mouse-wheel is turned upwards.
    */
  var invert: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable mouse-wheel (delta) acceleration.
    * Setting normalizeDelta: true translates mouse-wheel delta value to -1 or 1.
    */
  var normalizeDelta: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent the default behaviour which automatically scrolls the parent element when end
    * or beginning of scrolling is reached (same bahavior with browser’s native scrollbar).
    */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the mouse-wheel scrolling amount (in pixels).
    * The default value "auto" adjusts scrolling amount according to scrollable content length.
    */
  var scrollAmount: js.UndefOr[auto | Double] = js.undefined
}

object Anon_Auto {
  @scala.inline
  def apply(
    axis: x | y = null,
    deltaFactor: Int | Double = null,
    disableOver: js.Array[String] = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    normalizeDelta: js.UndefOr[Boolean] = js.undefined,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    scrollAmount: auto | Double = null
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (deltaFactor != null) __obj.updateDynamic("deltaFactor")(deltaFactor.asInstanceOf[js.Any])
    if (disableOver != null) __obj.updateDynamic("disableOver")(disableOver.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeDelta)) __obj.updateDynamic("normalizeDelta")(normalizeDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (scrollAmount != null) __obj.updateDynamic("scrollAmount")(scrollAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

