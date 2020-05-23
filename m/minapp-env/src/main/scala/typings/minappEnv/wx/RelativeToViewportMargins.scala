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
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): RelativeToViewportMargins = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeToViewportMargins]
  }
}

