package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sampling Heap Profile node. Holds callsite information, allocation statistics and child nodes.
  */
trait SamplingHeapProfileNode extends js.Object {
  /**
    * Function location.
    */
  var callFrame: nodeLib.inspectorMod.RuntimeNs.CallFrame
  /**
    * Child nodes.
    */
  var children: js.Array[SamplingHeapProfileNode]
  /**
    * Allocations size in bytes for the node excluding children.
    */
  var selfSize: scala.Double
}

object SamplingHeapProfileNode {
  @scala.inline
  def apply(
    callFrame: nodeLib.inspectorMod.RuntimeNs.CallFrame,
    children: js.Array[SamplingHeapProfileNode],
    selfSize: scala.Double
  ): SamplingHeapProfileNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callFrame")(callFrame)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("selfSize")(selfSize)
    __obj.asInstanceOf[SamplingHeapProfileNode]
  }
}

