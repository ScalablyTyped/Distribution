package typings.naverDashWhale.whaleNs.windowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  /**
    * Optional. If true, causes the window to be displayed in a manner that draws the user's attention to the window, without changing the focused window. The effect lasts until the user changes focus to the window. This option has no effect if the window already has focus. Set to false to cancel a previous draw attention request.
    * @since Chrome 14.
    */
  var drawAttention: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. If true, brings the window to the front. If false, brings the next window in the z-order to the front.
    * @since Chrome 8.
    */
  var focused: js.UndefOr[Boolean] = js.undefined
  /** Optional. The height to resize the window to in pixels. This value is ignored for panels. */
  var height: js.UndefOr[Double] = js.undefined
  /** Optional. The offset from the left edge of the screen to move the window to in pixels. This value is ignored for panels. */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * Optional. The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
    * One of: "normal", "minimized", "maximized", "fullscreen", or "docked"
    * @since Chrome 17.
    */
  var state: js.UndefOr[String] = js.undefined
  /** Optional. The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels. */
  var top: js.UndefOr[Double] = js.undefined
  /** Optional. The width to resize the window to in pixels. This value is ignored for panels. */
  var width: js.UndefOr[Double] = js.undefined
}

object UpdateInfo {
  @scala.inline
  def apply(
    drawAttention: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    left: Int | Double = null,
    state: String = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawAttention)) __obj.updateDynamic("drawAttention")(drawAttention)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
}

