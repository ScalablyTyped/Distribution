package typings.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapDiffSnapshot extends js.Object {
  var nodes: Double = js.native
  var size: String = js.native
  var size_bytes: Double = js.native
}

object HeapDiffSnapshot {
  @scala.inline
  def apply(nodes: Double, size: String, size_bytes: Double): HeapDiffSnapshot = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapDiffSnapshot]
  }
  @scala.inline
  implicit class HeapDiffSnapshotOps[Self <: HeapDiffSnapshot] (val x: Self) extends AnyVal {
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
    def setNodes(value: Double): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize_bytes(value: Double): Self = this.set("size_bytes", value.asInstanceOf[js.Any])
  }
  
}

