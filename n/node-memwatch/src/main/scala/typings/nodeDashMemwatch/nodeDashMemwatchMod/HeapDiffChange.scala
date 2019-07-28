package typings.nodeDashMemwatch.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffChange extends js.Object {
  var allocated_nodes: Double
  var details: js.Array[HeapDiffDetail]
  var freed_nodes: Double
  var size: String
  var size_bytes: Double
}

object HeapDiffChange {
  @scala.inline
  def apply(
    allocated_nodes: Double,
    details: js.Array[HeapDiffDetail],
    freed_nodes: Double,
    size: String,
    size_bytes: Double
  ): HeapDiffChange = {
    val __obj = js.Dynamic.literal(allocated_nodes = allocated_nodes, details = details, freed_nodes = freed_nodes, size = size, size_bytes = size_bytes)
  
    __obj.asInstanceOf[HeapDiffChange]
  }
}

