package typings.nodeMemwatch.mod

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
    val __obj = js.Dynamic.literal(allocated_nodes = allocated_nodes.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], freed_nodes = freed_nodes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeapDiffChange]
  }
}

