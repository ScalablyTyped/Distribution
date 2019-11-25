package typings.mcustomscrollbar.MCustomScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToParameterOptions extends js.Object {
  /**
    * Trigger user defined callback after scroll-to completes, value: true, false
    */
  var callbacks: js.UndefOr[Boolean] = js.undefined
  /**
    * Scroll scrollbar dragger (instead of content) to a number of pixels, values: true, false
    */
  var moveDragger: js.UndefOr[Boolean] = js.undefined
  /**
    * Scroll-to animation easing, values: "linear", "easeOut", "easeInOut".
    */
  var scrollEasing: js.UndefOr[String] = js.undefined
  /**
    * Scroll-to animation speed, value in milliseconds
    */
  var scrollInertia: js.UndefOr[Double] = js.undefined
  /**
    * Set a timeout for the method (the default timeout is 60 ms in order to work with automatic scrollbar update), value in milliseconds.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object ScrollToParameterOptions {
  @scala.inline
  def apply(
    callbacks: js.UndefOr[Boolean] = js.undefined,
    moveDragger: js.UndefOr[Boolean] = js.undefined,
    scrollEasing: String = null,
    scrollInertia: Int | Double = null,
    timeout: Int | Double = null
  ): ScrollToParameterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callbacks)) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(moveDragger)) __obj.updateDynamic("moveDragger")(moveDragger.asInstanceOf[js.Any])
    if (scrollEasing != null) __obj.updateDynamic("scrollEasing")(scrollEasing.asInstanceOf[js.Any])
    if (scrollInertia != null) __obj.updateDynamic("scrollInertia")(scrollInertia.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollToParameterOptions]
  }
}

