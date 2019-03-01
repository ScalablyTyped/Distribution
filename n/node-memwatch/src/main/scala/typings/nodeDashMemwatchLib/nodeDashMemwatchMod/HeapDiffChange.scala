package typings
package nodeDashMemwatchLib.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffChange extends js.Object {
  var allocated_nodes: scala.Double
  var details: js.Array[HeapDiffDetail]
  var freed_nodes: scala.Double
  var size: java.lang.String
  var size_bytes: scala.Double
}

object HeapDiffChange {
  @scala.inline
  def apply(
    allocated_nodes: scala.Double,
    details: js.Array[HeapDiffDetail],
    freed_nodes: scala.Double,
    size: java.lang.String,
    size_bytes: scala.Double
  ): HeapDiffChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allocated_nodes")(allocated_nodes)
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("freed_nodes")(freed_nodes)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("size_bytes")(size_bytes)
    __obj.asInstanceOf[HeapDiffChange]
  }
}

