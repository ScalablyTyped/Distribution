package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 用来扩展（或收缩）参照节点布局区域的边界 */
trait RelativeToViewportMargins extends js.Object {
  /** 节点布局区域的下边界 */
  var bottom: js.UndefOr[Double] = js.undefined
  /** 节点布局区域的左边界 */
  var left: js.UndefOr[Double] = js.undefined
  /** 节点布局区域的右边界 */
  var right: js.UndefOr[Double] = js.undefined
  /** 节点布局区域的上边界 */
  var top: js.UndefOr[Double] = js.undefined
}

object RelativeToViewportMargins {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): RelativeToViewportMargins = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeToViewportMargins]
  }
}

