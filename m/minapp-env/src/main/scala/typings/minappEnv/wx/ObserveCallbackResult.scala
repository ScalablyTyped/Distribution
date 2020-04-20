package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveCallbackResult extends js.Object {
  /** 目标边界 */
  var boundingClientRect: BoundingClientRectResult
  /** 相交比例 */
  var intersectionRatio: Double
  /** 相交区域的边界 */
  var intersectionRect: IntersectionRectResult
  /** 参照区域的边界 */
  var relativeRect: RelativeRectResult
  /** 相交检测时的时间戳 */
  var time: Double
}

object ObserveCallbackResult {
  @scala.inline
  def apply(
    boundingClientRect: BoundingClientRectResult,
    intersectionRatio: Double,
    intersectionRect: IntersectionRectResult,
    relativeRect: RelativeRectResult,
    time: Double
  ): ObserveCallbackResult = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], relativeRect = relativeRect.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveCallbackResult]
  }
}

