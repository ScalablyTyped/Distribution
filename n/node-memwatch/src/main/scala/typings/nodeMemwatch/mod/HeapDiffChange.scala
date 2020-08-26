package typings.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapDiffChange extends js.Object {
  var allocated_nodes: Double = js.native
  var details: js.Array[HeapDiffDetail] = js.native
  var freed_nodes: Double = js.native
  var size: String = js.native
  var size_bytes: Double = js.native
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
  @scala.inline
  implicit class HeapDiffChangeOps[Self <: HeapDiffChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllocated_nodes(value: Double): Self = this.set("allocated_nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailsVarargs(value: HeapDiffDetail*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[HeapDiffDetail]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreed_nodes(value: Double): Self = this.set("freed_nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize_bytes(value: Double): Self = this.set("size_bytes", value.asInstanceOf[js.Any])
  }
  
}

