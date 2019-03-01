package typings
package nodeLib.inspectorMod.ProfilerNs

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
  var callFrame: nodeLib.inspectorMod.RuntimeNs.CallFrame
  /**
    * Child node ids.
    */
  var children: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The reason of being not optimized. The function may be deoptimized or marked as don't
    * optimize.
    */
  var deoptReason: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of samples where this node was on top of the call stack.
    */
  var hitCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unique id of the node.
    */
  var id: scala.Double
  /**
    * An array of source position ticks.
    */
  var positionTicks: js.UndefOr[js.Array[PositionTickInfo]] = js.undefined
}

object ProfileNode {
  @scala.inline
  def apply(
    callFrame: nodeLib.inspectorMod.RuntimeNs.CallFrame,
    id: scala.Double,
    children: js.Array[scala.Double] = null,
    deoptReason: java.lang.String = null,
    hitCount: scala.Int | scala.Double = null,
    positionTicks: js.Array[PositionTickInfo] = null
  ): ProfileNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callFrame")(callFrame)
    __obj.updateDynamic("id")(id)
    if (children != null) __obj.updateDynamic("children")(children)
    if (deoptReason != null) __obj.updateDynamic("deoptReason")(deoptReason)
    if (hitCount != null) __obj.updateDynamic("hitCount")(hitCount.asInstanceOf[js.Any])
    if (positionTicks != null) __obj.updateDynamic("positionTicks")(positionTicks)
    __obj.asInstanceOf[ProfileNode]
  }
}

