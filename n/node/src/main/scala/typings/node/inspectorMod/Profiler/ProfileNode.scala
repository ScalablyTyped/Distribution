package typings.node.inspectorMod.Profiler

import typings.node.inspectorMod.Runtime.CallFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profile node. Holds callsite information, execution statistics and child nodes.
  */
trait ProfileNode extends js.Object {
  /**
    * Function location.
    */
  var callFrame: CallFrame
  /**
    * Child node ids.
    */
  var children: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The reason of being not optimized. The function may be deoptimized or marked as don't optimize.
    */
  var deoptReason: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of samples where this node was on top of the call stack.
    */
  var hitCount: js.UndefOr[Double] = js.undefined
  /**
    * Unique id of the node.
    */
  var id: Double
  /**
    * An array of source position ticks.
    */
  var positionTicks: js.UndefOr[js.Array[PositionTickInfo]] = js.undefined
}

object ProfileNode {
  @scala.inline
  def apply(
    callFrame: CallFrame,
    id: Double,
    children: js.Array[Double] = null,
    deoptReason: java.lang.String = null,
    hitCount: Int | Double = null,
    positionTicks: js.Array[PositionTickInfo] = null
  ): ProfileNode = {
    val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (deoptReason != null) __obj.updateDynamic("deoptReason")(deoptReason.asInstanceOf[js.Any])
    if (hitCount != null) __obj.updateDynamic("hitCount")(hitCount.asInstanceOf[js.Any])
    if (positionTicks != null) __obj.updateDynamic("positionTicks")(positionTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileNode]
  }
}

