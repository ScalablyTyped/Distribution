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
    val __obj = js.Dynamic.literal(allocated_nodes = allocated_nodes, details = details, freed_nodes = freed_nodes, size = size, size_bytes = size_bytes)
  
    __obj.asInstanceOf[HeapDiffChange]
  }
}

