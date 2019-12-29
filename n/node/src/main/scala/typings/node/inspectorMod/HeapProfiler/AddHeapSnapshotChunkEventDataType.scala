package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddHeapSnapshotChunkEventDataType extends js.Object {
  var chunk: String
}

object AddHeapSnapshotChunkEventDataType {
  @scala.inline
  def apply(chunk: String): AddHeapSnapshotChunkEventDataType = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddHeapSnapshotChunkEventDataType]
  }
}

