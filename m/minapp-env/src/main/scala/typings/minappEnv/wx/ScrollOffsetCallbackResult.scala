package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOffsetCallbackResult extends js.Object {
  /** 节点的 dataset */
  var dataset: js.Object
  /** 节点的 ID */
  var id: String
  /** 节点的水平滚动位置 */
  var scrollLeft: Double
  /** 节点的竖直滚动位置 */
  var scrollTop: Double
}

object ScrollOffsetCallbackResult {
  @scala.inline
  def apply(dataset: js.Object, id: String, scrollLeft: Double, scrollTop: Double): ScrollOffsetCallbackResult = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOffsetCallbackResult]
  }
}

