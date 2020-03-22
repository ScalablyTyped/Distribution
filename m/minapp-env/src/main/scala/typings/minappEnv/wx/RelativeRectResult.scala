package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 参照区域的边界 */
trait RelativeRectResult extends js.Object {
  /** 下边界 */
  var bottom: Double
  /** 左边界 */
  var left: Double
  /** 右边界 */
  var right: Double
  /** 上边界 */
  var top: Double
}

object RelativeRectResult {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): RelativeRectResult = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RelativeRectResult]
  }
}

