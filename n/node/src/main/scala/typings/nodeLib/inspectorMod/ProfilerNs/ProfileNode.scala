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

