package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHeapObjectIdReturnType extends js.Object {
  /**
    * Id of the heap snapshot object corresponding to the passed remote object id.
    */
  var heapSnapshotObjectId: HeapSnapshotObjectId
}

object GetHeapObjectIdReturnType {
  @scala.inline
  def apply(heapSnapshotObjectId: HeapSnapshotObjectId): GetHeapObjectIdReturnType = {
    val __obj = js.Dynamic.literal(heapSnapshotObjectId = heapSnapshotObjectId)
  
    __obj.asInstanceOf[GetHeapObjectIdReturnType]
  }
}

