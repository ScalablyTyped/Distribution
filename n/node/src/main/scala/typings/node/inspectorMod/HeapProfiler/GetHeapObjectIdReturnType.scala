package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHeapObjectIdReturnType extends js.Object {
  /**
    * Id of the heap snapshot object corresponding to the passed remote object id.
    */
  var heapSnapshotObjectId: HeapSnapshotObjectId = js.native
}

object GetHeapObjectIdReturnType {
  @scala.inline
  def apply(heapSnapshotObjectId: HeapSnapshotObjectId): GetHeapObjectIdReturnType = {
    val __obj = js.Dynamic.literal(heapSnapshotObjectId = heapSnapshotObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdReturnType]
  }
  @scala.inline
  implicit class GetHeapObjectIdReturnTypeOps[Self <: GetHeapObjectIdReturnType] (val x: Self) extends AnyVal {
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
    def setHeapSnapshotObjectId(value: HeapSnapshotObjectId): Self = this.set("heapSnapshotObjectId", value.asInstanceOf[js.Any])
  }
  
}

