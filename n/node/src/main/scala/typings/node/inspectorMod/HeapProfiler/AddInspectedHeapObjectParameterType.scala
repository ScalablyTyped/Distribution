package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddInspectedHeapObjectParameterType extends js.Object {
  /**
    * Heap snapshot object id to be accessible by means of $x command line API.
    */
  var heapObjectId: HeapSnapshotObjectId = js.native
}

object AddInspectedHeapObjectParameterType {
  @scala.inline
  def apply(heapObjectId: HeapSnapshotObjectId): AddInspectedHeapObjectParameterType = {
    val __obj = js.Dynamic.literal(heapObjectId = heapObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInspectedHeapObjectParameterType]
  }
  @scala.inline
  implicit class AddInspectedHeapObjectParameterTypeOps[Self <: AddInspectedHeapObjectParameterType] (val x: Self) extends AnyVal {
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
    def setHeapObjectId(value: HeapSnapshotObjectId): Self = this.set("heapObjectId", value.asInstanceOf[js.Any])
  }
  
}

